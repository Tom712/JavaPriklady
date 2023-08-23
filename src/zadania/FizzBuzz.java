package zadania;

import java.text.Normalizer;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        int cislo = 1;
        for (;;) {
            if (cislo%3 == 0 && cislo%5 == 0 ){
                System.out.println("Fizz Buzz");
            } else if (cislo%3 == 0) {
                System.out.println("Fizz");
            } else if (cislo%5 == 0) {
                System.out.println("Buzz");
            }  else {
                System.out.println(cislo);
            }
            cislo++;
            if (cislo > 100){
                break;
            }
        }


    }








}
