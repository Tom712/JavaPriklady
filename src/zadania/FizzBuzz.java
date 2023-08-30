package zadania;

public class FizzBuzz {
    ////////Copilot riesenie

  /*public static void fizzBuzz(int n) {
        for (int i=1;i<=n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }*/

    public static void main(String[] args) {
        /////fizzBuzz(100);


        //moje riesenie
        int cislo = 1;
        do {
            if (cislo % 3 == 0 && cislo % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (cislo % 3 == 0) {
                System.out.println("Fizz");
            } else if (cislo % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(cislo);
            }
            cislo++;
        } while (cislo <= 100);



    }

}
