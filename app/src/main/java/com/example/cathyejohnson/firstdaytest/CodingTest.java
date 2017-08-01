package com.example.cathyejohnson.firstdaytest;

import java.util.ArrayList;

/**
 * Created by cathye.johnson on 8/1/2017.
 */

public class CodingTest {
    public static void main(String[] args) {


        //if number is divisible by 3, the print fizz
        //if number is divisible by 5, the print buzz
        //if number is divisible by 3 and 5, the print fizx buzz
        printfizzBuzz(15);
    }

    public void printfizzBuzz(int numbers){

        for(int counter = 0; counter < numbers ; counter++){
            System.out.println("Evaluating: " + numbers);
            if(counter%3 == 0 || counter%5 == 0){
                String output = "";

                if(counter%3 == 0){
                    output = "fizz";
                }
                if(counter%5 == 0){
                    output = output + " buzz";
                }
                System.out.println(output);
            }
        }
    }

    public void getDuplicates(ArrayList<String> passedStringArray){
        String beingEvaluated;

        while(passedStringArray.hasNext()){
            beingEvaluated = passedStringArray.getNext();
            while(passedStringArray.hasNext){
                if(passedStringArray.getNext() == beingEvaluated){
                    System.out.println("Duplicate of String " + beingEvaluated + "found");
                }
            }

        }

    }

}
