package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void test_fizzbuzzreplaceNumber_canReturnFizz() {
        //give
        int numb = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when

        String word = fizzBuzz.replaceNumber(numb);

        //then

    assertEquals("Fizz", word);
    }

    @Test
    public void test_fizzbuzzreplaceNumber_canReturnBuzz() {
        //give
        int numb = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when

        String word = fizzBuzz.replaceNumber(numb);

        //then

    assertEquals("Buzz", word);
    }
    

    @Test
    public void test_fizzbuzzreplaceNumber_canReturnDivisiblePor3Y5() {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("FizzBuzz",word);

    }


}


