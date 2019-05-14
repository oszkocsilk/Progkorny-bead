package sample;

import java.util.ArrayList;

/**
 * Uses math calculations.
 */
public class MathThings {
    /**
     * Counts the score.
     *
     * @param bombs number of bombs.
     * @param time  is the time.
     * @return score.
     */


    public double score(double bombs, double time) {

        bombs = bombs * 1000;

        time = time / 60;

        return (bombs / time);

    }

    /**
     * makes an easy counting method.
     *
     * @param list   what you modify.
     * @param row    the rows of the table.
     * @param column the coulums of the table.
     */


    public void makeList(ArrayList<Integer> list, int row, int column) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                list.add(i * 100 + j);
            }
        }

    }


 }