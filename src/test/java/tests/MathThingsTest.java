package tests;

import org.junit.jupiter.api.Test;
import sample.MathThings;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */

public class MathThingsTest {

    /**
     *
     */
    @Test
    void score() {
        MathThings score=new MathThings();

        double first=10;
        double secound=600;

        assertEquals(1000,score.score(first,secound));
    }

    /**
     *
     */
    @Test
    void makeList(){
        MathThings score=new MathThings();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int row=5;
        int column= 2;

        score.makeList(list,row,column);

        assertEquals(0,list.get(0));
        assertEquals(100,list.get(2));
        assertEquals(401,list.get(9));


    }
}