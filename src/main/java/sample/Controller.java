package sample;


import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;


/**
 * This watches the mouse click, runs the timer, count disabled buttons, watches if you win or lost.
 */
@Slf4j
public class Controller implements mezo{

    /**
     * Timer counts the time.
     */
    public double timer=0.0;
    /**
     *  The score of the player.
     */
    private Double score=0.0;
    /**
     * Watches if you lose.
     */
    private boolean lose=false;
    /**
     * Disabled button counter.
     */
    int disabled=0;
    /**
     * Watches if you win.
     */
    private boolean win;
    /**
     * Creating variable for the Actiontimer.
     */
    boolean próba=false;

    /**
     * Creating new bombs.
     */
    private Akna akna=new Akna();
    /**
     * Creating aknakereso.
     */
    private Aknakereso aknakereso;
    /**
     * Creating Blow up call.
     */
    private BlowedUp b;
    /**
     * Entity Manager for database connection.
     */
    private static EntityManager em;

    /**
     * List of bombs.
     */
    ArrayList<Integer> toClear = new ArrayList<Integer>();
    /**
     * Call of Nullblower.
     */
    NullBlower nullBlower = new NullBlower();
    /**
     * Calling MathThings.
     */
    MathThings s=new MathThings();
    /**
     * Watches mouse event.
     */



    EventHandler<MouseEvent> eventHandler = new EventHandler<>() {
        /**
         *Watches the mouse click, if it is on a button.
         * @param event Event of the mouse click
         */
        @Override
        public void handle(MouseEvent event) {
            log.info("Waiting for mouse event");
            for (int i = 0; i < aknakereso.getMezo().length; i++) {
                for (int j = 0; j < aknakereso.getMezo().length; j++) {
                    if (event.getSource().equals(aknakereso.getMezo()[i][j])) {
                            log.info("Mouse click happened");
                            disabled++;
                        if (counter[i][j] != 666) {

                            if (counter[i][j] == 0) {
                                log.info("Zeros exploded.");
                                aknakereso.getMezo()[i][j].setText(counter[i][j] + "");
                                aknakereso.getMezo()[i][j].setDisable(true);

                                toClear.add(i * 100 + j);
                                nullBlower.Blower(toClear);

                            } else {
                                log.info("Number selected");
                                aknakereso.getMezo()[i][j].setText(counter[i][j] + "");
                                aknakereso.getMezo()[i][j].setDisable(true);
                            }
                            disabled+=nullBlower.getDisabledCounter();
                            win();
                            nullBlower.setDisabledCounter(0);
                        } else {
                            log.info("You choose a BOMB");
                            b.Blowed();
                            b.display("LOSER","YOU LOST!");
                            lose=true;

                        }
                    }
                }
            }
        }
    };


    /**
     *Tests if you win or not.
     */

    public void win() {
        for (int i = 0; i < Aknakereso.counter[0].length; i++) {
            for (int j = 0; j < Aknakereso.counter.length; j++) {
                if (Aknakereso.counter[i][j] == BOMB && Aknakereso.mezo[i][j].isDisabled() == false) {
                    win = false;
                }
                else if(disabled==(all-akna.getNumberOfBombs()) ){
                    win=true;
                    log.info("Game won, here are no available non-bomb button.");
                }
            }
        }
    }

    /**
     *Starts the timer and tries to catch mouse event.
     * @param aknakereso calls the created aknakereso.
     */

    public Controller(Aknakereso aknakereso) {
        this.aknakereso = aknakereso;
        this.b = new BlowedUp(aknakereso);

        new AnimationTimer(){
            @Override
            public void handle(long l) {

                    timer++;
                    if(próba==false){
                        if (win==true) {
                            próba=true;
                            score= s.score(akna.getNumberOfBombs(),timer);
                            System.out.println("score értéke:"+getScore());
                            b.display("WIN", "YOU WIN!\nYour score is: "+score);

                            this.stop();

                    }
                 if (lose==true) {
                      próba=true;

                        this.stop();

                    }
                }
            }
        }.start();

        for (int i = 0; i < aknakereso.getMezo().length; i++) {
            for (int j = 0; j < aknakereso.getMezo().length; j++) {
                aknakereso.getMezo()[i][j].addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler);
            }
        }
    }

    /**
     *Make contact with the database, than pushes up te new data.
     * @param Score the score of the current player for uploading.
     */
    private void data(double Score){


            EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-persistence-unit-1");
            em = emf.createEntityManager();
            createPlayer(Score);
            em.close();
            emf.close();
        }

    /**
     *Makes a new player, whith an ID and pushes up to the database.
     * @param Score the score of the current player.
     */
    private static void createPlayer(double Score) {
        em.getTransaction().begin();
        Player emp = new Player(Score);
        em.persist(emp);
        em.getTransaction().commit();
    }

    /**
     *
     * @return gives back the score
     */
    public double getScore() {
        return score;
    }

    /**
     *
     * @return gives back the value of Disabled buttons.
     */

    public int getDisabled() {
        return disabled;
    }


}