package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * Giving the size of the buttons.
 */
public interface mezo {

    /**
     * The width of the buttons.
     */
    int width=30;

    /**
     * The height of the buttons.
     */
    int height=30;

    /**
     *  The size of the buttons.
     */
    int all=width*height;

    /**
     * Creating the buttons.
     */
    Button[][] mezo= new Button[width][height];

    /**
     * The anchor pane, where the buttons lays.
     */
    AnchorPane table = new AnchorPane();

    /**
     * Counter counts the buttons.
     */
    int[][] counter= new int[width][height];

    /**
     * Bomb has a value for easy work.
     */
    int BOMB=666;

}
