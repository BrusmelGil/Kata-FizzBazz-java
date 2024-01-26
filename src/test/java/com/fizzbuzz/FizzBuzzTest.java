package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void test_fizzbuzzDevuelveFizz(){

    int number = 9;

    FizzBuzz fizzBuzz = new FizzBuzz();

    String word = fizzBuzz.replaceNumber(number);

    assertEquals("Fizz", word);

    }

    @Test
    public void test_fizzbuzzDevuelveBuzz(){

    int number = 10;

    FizzBuzz fizzBuzz = new FizzBuzz();

    String word = fizzBuzz.replaceNumber(number);

    assertEquals("Buzz", word);

    }

    @Test
    public void test_fizzbuzzReplaceNumber_DevuelveFizzBuzz() {
        // Given
        int numb = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String word = fizzBuzz.replaceNumber (numb);

        // Then 
        assertEquals("FizzBuzz", word);
    }


    @Test
    public void test_fizzbuzzReplaceNumber_DevuelveNumbAnterior() {
        // Given
        int numb = 8;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String word = fizzBuzz.replaceNumber (numb);

        // Then 
        assertEquals(String.valueOf(numb), word);
    }

//Parte Dos

    @Test
    public void test_fizzbuzzReplaceNumber_DevuelveFizzdivisiblePor3oContiene3() {
        // Given
        int isDivisibleBy3 = 9;
        int contains = 534;

        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String divisibleResult = fizzBuzz.replaceNumber(isDivisibleBy3);
        String resulContains = fizzBuzz.replaceNumber(contains);

        // Then 
        assertEquals("Fizz", resulContains);
        assertEquals("Fizz", divisibleResult);
    }


    @Test
    public void test_fizzbuzzReplaceNumber_DevuelveFizzdivisiblePor5oContiene5() {
        // Given
        int isDivisibleBy5= 10;
        int container = 25;

        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String divisibleResult = fizzBuzz.replaceNumber(isDivisibleBy5);
        String resulContainer= fizzBuzz.replaceNumber(container);

        // Then

        assertEquals("Buzz", resulContainer);
        assertEquals("Buzz",divisibleResult );

    }




}


