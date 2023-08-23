package zadania;

public class MaticaDo25 {


    public static void main(String[] args) {

        for (int i = 1;i<26;i++) {
            System.out.printf("%5d ",i);
            if(i%5==0){
                System.out.printf("\n");
            };
        }


        int cislo = 1;

        for (int x = 1;x<26; x++ ) {

            System.out.printf("%10d ",cislo);
            if(x%5==0){
                System.out.printf("\n");
            }
            cislo  = cislo * 2;
        }

    }
}
