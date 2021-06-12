package oop.example.Ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallGameMessageTest {

    @Test
    void ismessage_returs_the_correct_message() {

        //given
        BallGameMessage ballGameMessage = new BallGameMessage();

        int random=4;

        String actual = ballGameMessage.message(random);
        String expected = "Ask again later.";

        assertEquals(actual,expected);

    }
    @Test
    void ismessage_returs_the_correct_message_set1() {

        //given
        BallGameMessage ballGameMessage = new BallGameMessage();

        int random=3;

        String actual = ballGameMessage.message(random);
        String expected = "Maybe.";

        assertEquals(actual,expected);

    }
    @Test
    void ismessage_returs_the_correct_message_set3() {

        //given
        BallGameMessage ballGameMessage = new BallGameMessage();

        int random=2;

        String actual = ballGameMessage.message(random);
        String expected = "No.";

        assertEquals(actual,expected);

    }
    @Test
    void ismessage_returs_the_correct_message_set4() {

        //given
        BallGameMessage ballGameMessage = new BallGameMessage();

        int random=1;

        String actual = ballGameMessage.message(random);
        String expected = "Yes.";

        assertEquals(actual,expected);

    }
}