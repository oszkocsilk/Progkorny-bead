package sample;

import  javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "Akna")
public class Player {

    /**
     * The ID in the database.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    /**
     * The score at the database.
     */
    @Column(name="Score")
    private double Score;

    /**
     *
     * @return ID of player.
     */

    public Integer getID() {
        return ID;
    }

    /**
     *
     * @param ID sets ID of player.
     */

    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     *
     * @return the score of the player.
     */

    public double getScore() {
        return Score;
    }

    /**
     *
     * @param Score the score of the player.
     */

    public void Score(double Score) {
        Score = Score;
    }

    /**
     *
     * @param ID  ID of the player.
     * @param Score the score of the player.
     */

    public Player(Integer ID, double Score) {
        this.ID = ID;
        this.Score = Score;
    }

    /**
     *
     * @param Score the score of the player.
     */
    public Player( double Score) {
        this.Score = Score;
    }

    /**
     *
     * @return heding of the database and the datas in text
     */
    @Override
    public String toString() {
        return "Player{" +
                "ID=" + ID +
                ", Score=" + Score +
                '}';
    }

    /**
     * Instantiating of Player.
     */
    public Player() {
    }

}
