package tests;

import org.junit.jupiter.api.Test;
import sample.NullBlower;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
public class NullBlowerTest {

    /**
     *
     */
    @Test
    void isEmptyList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        NullBlower nullBlower = new NullBlower();
        assertEquals(true, nullBlower.isEmptyList(list));

    }

    /**
     *
     */
    @Test
    void isnotEmptyList() {
        NullBlower nullBlower = new NullBlower();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(125);

        assertEquals(false, nullBlower.isEmptyList(list));

    }
}