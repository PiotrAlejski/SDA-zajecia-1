package zajecia.piate;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by RENT on 2017-02-06.
 */
public class zajecia5 {

    public static void main(String[] args) {
        //   square(3);
        //   trinangle(4);
        // tree(10);
        // oneMATRIX(10);
        homework ();
    }

    public static int[] homework() {
        int[] array = new int[10];
        boolean flag = true;
        while(flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            if (numberFromUser >= 0 && numberFromUser <= 9) {
                array[numberFromUser]++;
            }else {
                flag = false;
            }
        }
        return array;
    }



    public static void oneMATRIX(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void trinangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void square(int number) {
        for (int i = 0; i < number; i++) {     //wiersze
            for (int j = 0; j < number; j++) { //kolumny
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void tree(int number) {
        for (int i = 0; i < number; i++) {             //ilość wiersza
            for (int k = 0; k < number - i - 1; k++) { //wyświtla spacje
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {   //wyświetla gwiazdki
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= (number - 1); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

}
