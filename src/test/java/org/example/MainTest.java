package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void ifUserEntersPassword_thenPrintOutLength() {
            //GIVEN
            String password = "abc123";
            //WHEN
            int actual = Main.checkPasswordlength(password);
            //THEN
            int expected = 6;

            assertEquals(expected, actual);
        }

    @Test
    void ifPasswordHasNumbers_thenReturnTrue() {
        //GIVEN
        String password = "abc";
        //WHEN
        boolean actual = Main.checkForNumbersInPassword(password);
        //THEN
        boolean expected = true;

        assertTrue(expected);
    }

    @Test
    void ifPasswordHasUpperAndLowercase_thenReturnTrue() {
        //GIVEN
        String password = "abc";
        //WHEN
        boolean actual = Main.hasUpperAndLowercase(password);
        //THEN
        boolean expected = true;

        assertTrue(expected);
    }

    @Test
    void ifPasswordIsWeak_thenReturnTrue() {
        //GIVEN
        String password = "Aa345678";
        //WHEN
        boolean actual = Main.checkForWeakPassword(password);
        //THEN
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void ifPasswordHasSpecialSymbols_thenReturnTrue() {
        //GIVEN
        String password = "pass1234";
        //WHEN
        boolean actual = Main.checkForSpecialSymbols(password);
        //THEN
        boolean expected = true;

        assertEquals(expected, actual);
    }

}