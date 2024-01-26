package com.fizzbuzz;

public class FizzBuzz {

    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String fizzBuzz () {
        if(this.number % 3 == 0 && this.number % 5 == 0){
            return "fizzbuzz";
        }

        if(this.number % 3 == 0){
            return "fizz";
        }
        if(this.number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(this.number);
    }
    
    }






