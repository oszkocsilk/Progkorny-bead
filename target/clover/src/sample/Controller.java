/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;


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
public class Controller implements mezo {public static class __CLR4_3_1hghgjvnnpjq4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557829914850L,8589935092L,717,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * {@code}timer counts the time.
     * {@code}score counts the score.
     * {@code}lose watches if you lose.
     * {@code}win watches if you win.
     * {@code}disables counts the disabled buttons.
     */
    public double timer=0.0;
    private Double score=0.0;
    private boolean lose=false;
    int disabled=0;
    private boolean win;


    private Akna akna=new Akna();
    private Aknakereso aknakereso;
    private BlowedUp b;
    private static EntityManager em;

    ArrayList<Integer> toClear = new ArrayList<Integer>();
    NullBlower nullBlower = new NullBlower();


    EventHandler<MouseEvent> eventHandler = new EventHandler<>() {
        /**
         *Watches the mouse click, if it is on a button.
         * @param event Event of the mouse click
         */
        @Override
        public void handle(MouseEvent event) {try{__CLR4_3_1hghgjvnnpjq4.R.inc(628);
            __CLR4_3_1hghgjvnnpjq4.R.inc(629);log.info("Waiting for mouse event");
            __CLR4_3_1hghgjvnnpjq4.R.inc(630);for (int i = 0; (((i < aknakereso.getMezo().length)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(631)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(632)==0&false)); i++) {{
                __CLR4_3_1hghgjvnnpjq4.R.inc(633);for (int j = 0; (((j < aknakereso.getMezo().length)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(634)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(635)==0&false)); j++) {{
                    __CLR4_3_1hghgjvnnpjq4.R.inc(636);if ((((event.getSource().equals(aknakereso.getMezo()[i][j]))&&(__CLR4_3_1hghgjvnnpjq4.R.iget(637)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(638)==0&false))) {{
                            __CLR4_3_1hghgjvnnpjq4.R.inc(639);log.info("Mouse click happened");
                            __CLR4_3_1hghgjvnnpjq4.R.inc(640);disabled++;
                        __CLR4_3_1hghgjvnnpjq4.R.inc(641);if ((((counter[i][j] != 666)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(642)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(643)==0&false))) {{

                            __CLR4_3_1hghgjvnnpjq4.R.inc(644);if ((((counter[i][j] == 0)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(645)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(646)==0&false))) {{
                                __CLR4_3_1hghgjvnnpjq4.R.inc(647);log.info("Zeros exploded.");
                                __CLR4_3_1hghgjvnnpjq4.R.inc(648);aknakereso.getMezo()[i][j].setText(counter[i][j] + "");
                                __CLR4_3_1hghgjvnnpjq4.R.inc(649);aknakereso.getMezo()[i][j].setDisable(true);

                                __CLR4_3_1hghgjvnnpjq4.R.inc(650);toClear.add(i * 100 + j);
                                __CLR4_3_1hghgjvnnpjq4.R.inc(651);nullBlower.Blower(toClear);

                            } }else {{
                                __CLR4_3_1hghgjvnnpjq4.R.inc(652);log.info("Number selected");
                                __CLR4_3_1hghgjvnnpjq4.R.inc(653);aknakereso.getMezo()[i][j].setText(counter[i][j] + "");
                                __CLR4_3_1hghgjvnnpjq4.R.inc(654);aknakereso.getMezo()[i][j].setDisable(true);
                            }
                            }__CLR4_3_1hghgjvnnpjq4.R.inc(655);disabled+=nullBlower.getDisabledCounter();
                            __CLR4_3_1hghgjvnnpjq4.R.inc(656);win();
                            __CLR4_3_1hghgjvnnpjq4.R.inc(657);nullBlower.setDisabledCounter(0);
                        } }else {{
                            __CLR4_3_1hghgjvnnpjq4.R.inc(658);log.info("You chose a BOMB");
                            __CLR4_3_1hghgjvnnpjq4.R.inc(659);b.Blowed();
                            __CLR4_3_1hghgjvnnpjq4.R.inc(660);b.display("LOSER","YOU LOST!");
                            __CLR4_3_1hghgjvnnpjq4.R.inc(661);lose=true;

                            }
                        }}
                    }}
                }}
            }}finally{__CLR4_3_1hghgjvnnpjq4.R.flushNeeded();}}
        };


    /**
     *Tests if you win or not.
     */

    public void win() {try{__CLR4_3_1hghgjvnnpjq4.R.inc(662);
        __CLR4_3_1hghgjvnnpjq4.R.inc(663);for (int i = 0; (((i < Aknakereso.counter[0].length)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(664)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(665)==0&false)); i++) {{
            __CLR4_3_1hghgjvnnpjq4.R.inc(666);for (int j = 0; (((j < Aknakereso.counter.length)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(667)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(668)==0&false)); j++) {{
                __CLR4_3_1hghgjvnnpjq4.R.inc(669);if ((((Aknakereso.counter[i][j] == BOMB && Aknakereso.mezo[i][j].isDisabled() == false)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(670)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(671)==0&false))) {{
                    __CLR4_3_1hghgjvnnpjq4.R.inc(672);win = false;
                }
                }else {__CLR4_3_1hghgjvnnpjq4.R.inc(673);if((((disabled==(all-akna.getNumberOfBombs()) )&&(__CLR4_3_1hghgjvnnpjq4.R.iget(674)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(675)==0&false))){{
                    __CLR4_3_1hghgjvnnpjq4.R.inc(676);win=true;
                    __CLR4_3_1hghgjvnnpjq4.R.inc(677);log.info("Game won, here are no available non-bomb button.");
                }
            }}}
        }}
    }}finally{__CLR4_3_1hghgjvnnpjq4.R.flushNeeded();}}

    /**
     *Starts the timer and tries to catch mouse event.
     * @param aknakereso calls the created aknakereso.
     */
    boolean pr\u00f3ba=false;
    public Controller(Aknakereso aknakereso) {try{__CLR4_3_1hghgjvnnpjq4.R.inc(678);
        __CLR4_3_1hghgjvnnpjq4.R.inc(679);this.aknakereso = aknakereso;
        __CLR4_3_1hghgjvnnpjq4.R.inc(680);this.b = new BlowedUp(aknakereso);

        __CLR4_3_1hghgjvnnpjq4.R.inc(681);new AnimationTimer(){
            @Override
            public void handle(long l) {try{__CLR4_3_1hghgjvnnpjq4.R.inc(682);

                    __CLR4_3_1hghgjvnnpjq4.R.inc(683);timer++;
                //System.out.println(pr\u00f3ba);
                    //if(pr\u00f3ba==false){
                __CLR4_3_1hghgjvnnpjq4.R.inc(684);if ((((win==true)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(685)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(686)==0&false))) {{
                    //pr\u00f3ba=true;
                    __CLR4_3_1hghgjvnnpjq4.R.inc(687);score = ( akna.getNumberOfBombs() * 1000 )   /   ( timer / 60 );
                    __CLR4_3_1hghgjvnnpjq4.R.inc(688);System.out.println("score \u00e9rt\u00e9ke:"+getScore());
                    __CLR4_3_1hghgjvnnpjq4.R.inc(689);b.display("WIN", "YOU WIN!\nYour score is: "+score);
                    __CLR4_3_1hghgjvnnpjq4.R.inc(690);data(score);

                    __CLR4_3_1hghgjvnnpjq4.R.inc(691);this.stop();



                    }
                 }__CLR4_3_1hghgjvnnpjq4.R.inc(692);if ((((lose==true)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(693)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(694)==0&false))) {{
                      //pr\u00f3ba=true;

                        __CLR4_3_1hghgjvnnpjq4.R.inc(695);this.stop();


                    }
               // }
            }}finally{__CLR4_3_1hghgjvnnpjq4.R.flushNeeded();}}
        }.start();

        __CLR4_3_1hghgjvnnpjq4.R.inc(696);for (int i = 0; (((i < aknakereso.getMezo().length)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(697)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(698)==0&false)); i++) {{
            __CLR4_3_1hghgjvnnpjq4.R.inc(699);for (int j = 0; (((j < aknakereso.getMezo().length)&&(__CLR4_3_1hghgjvnnpjq4.R.iget(700)!=0|true))||(__CLR4_3_1hghgjvnnpjq4.R.iget(701)==0&false)); j++) {{
                __CLR4_3_1hghgjvnnpjq4.R.inc(702);aknakereso.getMezo()[i][j].addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler);
            }
        }}
    }}finally{__CLR4_3_1hghgjvnnpjq4.R.flushNeeded();}}

    /**
     *Make contact with the database, than pushes up te new data.
     * @param Score the score of the current player for uploading.
     */
    private void data(double Score){try{__CLR4_3_1hghgjvnnpjq4.R.inc(703);


            __CLR4_3_1hghgjvnnpjq4.R.inc(704);EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-persistence-unit-1");
            __CLR4_3_1hghgjvnnpjq4.R.inc(705);em = emf.createEntityManager();
            __CLR4_3_1hghgjvnnpjq4.R.inc(706);createPlayer(Score);
            __CLR4_3_1hghgjvnnpjq4.R.inc(707);em.close();
            //emf.close();
        }finally{__CLR4_3_1hghgjvnnpjq4.R.flushNeeded();}}

    /**
     *Makes a new player, whith an ID and pushes up to the database.
     * @param Score the score of the current player.
     */
    private static void createPlayer(double Score) {try{__CLR4_3_1hghgjvnnpjq4.R.inc(708);
        __CLR4_3_1hghgjvnnpjq4.R.inc(709);em.getTransaction().begin();
        __CLR4_3_1hghgjvnnpjq4.R.inc(710);Player emp = new Player(Score);
        __CLR4_3_1hghgjvnnpjq4.R.inc(711);em.persist(emp);
        __CLR4_3_1hghgjvnnpjq4.R.inc(712);em.getTransaction().commit();
    }finally{__CLR4_3_1hghgjvnnpjq4.R.flushNeeded();}}

    /**
     *
     * @return gives back the score
     */
    public double getScore() {try{__CLR4_3_1hghgjvnnpjq4.R.inc(713);
        __CLR4_3_1hghgjvnnpjq4.R.inc(714);return score;
    }finally{__CLR4_3_1hghgjvnnpjq4.R.flushNeeded();}}

    /**
     *
     * @return gives back the value of Disabled buttons.
     */

    public int getDisabled() {try{__CLR4_3_1hghgjvnnpjq4.R.inc(715);
        __CLR4_3_1hghgjvnnpjq4.R.inc(716);return disabled;
    }finally{__CLR4_3_1hghgjvnnpjq4.R.flushNeeded();}}
}