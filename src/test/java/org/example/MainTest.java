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

}