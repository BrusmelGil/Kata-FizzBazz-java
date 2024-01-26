package com.fizzbuzz;

public class FizzBuzz {

    public String replaceNumber(int numb) {

        boolean isDivisibleBy3 = numb % 3 == 0;
        boolean isDivisibleBy5 = numb % 5 == 0;

        if (isDivisibleBy3 && isDivisibleBy5) return "FizzBuzz";
        if (isDivisibleBy3) return "Fizz";
        if (isDivisibleBy5) return "Buzz";

        return String.valueOf (numb);
    
    }
    

    
    }






