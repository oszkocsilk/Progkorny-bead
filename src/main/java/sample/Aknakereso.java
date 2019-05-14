package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import lombok.extern.slf4j.Slf4j;

/**
 * Makes the whole table with bombs.
 */
@Slf4j
public class Aknakereso implements mezo{

    /**
     * Empty slot above the table.
     */
    private static int buttonLayout= 80;
    /**
     * Places bombs.
     */
    private Akna Leteszi =new Akna();

    /**
     * Makes  buttons, than puts the bombs down.
     */
    public Aknakereso() {

        for (int i=0;i<mezo[0].length;i++)
        {   for(int j=0;j<mezo[1].length;j++)
            {

                mezo[i][j] = new Button();
                mezo[i][j].setPrefSize(25,25);
                mezo[i][j].setLayoutX(25*i);
                mezo[i][j].setLayoutY(buttonLayout+25*j);
                table.getChildren().add(mezo[i][j]);

            }
        }
        Leteszi.aknák();
    }

    /**
     *
     * @return helps to get the link the empty slots
     */
    public Button[][] getMezo() {
        return mezo;
    }

    /**
     *
     * @return gives an orderd table with the slots
     */
    public AnchorPane getTable() {
        return table;
    }

}
