package pers.guessnumbers;

import org.junit.Test;

/**
 * Created by 筱湮 on 2018/1/16.
 */
public class GuessTest {

    @Test
    public void shouldReturnxAxB(){

        Guess guess = new Guess();

        String result = guess.guessNumber("1234");
    }
}
