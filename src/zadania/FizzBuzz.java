package zadania;

public class FizzBuzz {
    ////////Copilot riesenie
/*
  public static void fizzBuzz(int n) {
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
    }
*/
    public static void main(String[] args) {
        /////fizzBuzz(100);


        //moje riesenie
        int cislo = 1;
        String cele = "";
        do {
            if (cislo % 3 == 0 && cislo % 5 == 0) {
                //System.out.print("Fizz Buzz, ");
                cele +="Fizz Buzz, ";
            } else if (cislo % 3 == 0) {
               // System.out.print("Fizz, ");
                cele +="Fizz, ";
            } else if (cislo % 5 == 0) {
                //System.out.print("Buzz, ");
                cele +="Buzz, ";
            } else {
                //System.out.printf("%d, ",cislo);
                cele += cislo + ", ";
            }
            cislo++;


        } while (cislo <= 100);

        cele = cele.substring(0,cele.length()-2);
        System.out.println(cele);

    }

}
