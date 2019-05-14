package tests;

import org.junit.jupiter.api.Test;
import sample.Akna;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
public class AknaTest {
    /**
     *
     */

    Akna akna=new Akna();

    /**
     *
     */
    @Test
    void aknák() {
        assertEquals(3,akna.getNumberOfBombs());
    }



}