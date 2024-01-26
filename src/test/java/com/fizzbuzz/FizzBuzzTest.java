package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void test_fizzbuzzDevuelveFizz(){

    int number = 3;

    FizzBuzz fizzBuzz = new FizzBuzz();

    String word = fizzBuzz.replaceNumber(number);

    assertEquals("Fizz", word);

    }

    @Test
    public void test_fizzbuzzDevuelveBuzz(){

    int number = 5;

    FizzBuzz fizzBuzz = new FizzBuzz();

    String word = fizzBuzz.replaceNumber(number);

    assertEquals("Buzz", word);

    }

    @Test
    public void test_fizzbuzzReplaceNumber_CanReturnFizzBuzz() {
        // Given
        int numb = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String word = fizzBuzz.replaceNumber (numb);

        // Then 
        assertEquals("FizzBuzz", word);
    }

    @Test
    public void test_fizzbuzzReplaceNumber_CanReturnNumb() {
        // Given
        int numb = 8;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String word = fizzBuzz.replaceNumber (numb);

        // Then 
        assertEquals(String.valueOf(numb), word);
    }


}


