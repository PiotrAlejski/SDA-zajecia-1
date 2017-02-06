package zajecia.czwarte;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class ZadaniaZeScannerem {


    public static void main(String[] args) {
      //  ListNumberFromUser();
      //  compareThreeNumbers(5);
     //   compareThreeNumbersFRomUser();
      //  listEvenNumberFromUser();
      //  compareThreeNumbersFRomUser();
       // System.out.println("Grade system 2000 z o.o.");
        //double avg = avgOfGrades();
        //System.out.println("Avg of your grades is:" + avg);
        calculator();

    }

    public static void calculator() {
        System.out.println("Calculator - options list:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int action = getNumberFromUser("Please insert a number of option:");
        int result = 0;
        if (action < 0 || action > 4) {
            System.out.println("You selected the incorrect options");
        } else {
            int number1 = getNumberFromUser("Insert first number: ");
            int number2 = getNumberFromUser("Inser second number: ");
            if (action == 1) {
                result = number1 + number2;
            } else if (action == 2) {
                result = number1 - number2;
            } else if (action == 3) {
                result = number1 * number2;
            } else {
                if (number2 == 0) {
                    System.out.println("We do not divide by 0!");
                } else {
                    result = number1 / number2;
                }
            }
            System.out.println("Your result is: " + result);
        }
    }

    public static double avgOfGrades() {

        System.out.println(" Grade system 2000 z o.o.");
        int size = getNumberFromUser("insert number of grades");
        int[] array = new int[size];
        for(int i = 0 ; i < array.length ; i++ ) {
            array[i] = getNumberFromUser("insert" + (i+1) + "grade:");
        }
        double avg = zajecia4.avg(array);
        return avg;
    }




    public static void compareThreeNumbersFRomUser() {
        //pobieramy od usera 3 liczby
        //wyswietlamy najwieksza i najmniejsza
        int a = getNumberFromUser("insert first number");
        int b = getNumberFromUser("insert second number");
        int c = getNumberFromUser("insert third number");

        System.out.println("max:" + max(a, b, c));
        System.out.println("min" + min(a, b, c));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }


    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
            return min(array);
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return max(array);
    }

    public static void ListNumberFromUser() {
        int number = getNumberFromUser();
        zajecia4.printLessThan(number);
    }

    public static void listEvenNumberFromUser() {
        //pobieramy liczbe
        //wyswietlamy tylko przyste mniejsze od

        int number = getNumberFromUser();
        zajecia4.printEvenLessTHan(number);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your number");
        return scanner.nextInt();
    }


    public static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }


    public static void checkNumberFROMuser() {
        //definiujemy scanner
        //czytamy od user liczbe
        //sprawdzamy czy liczba jest parzysta
        //jezeli tak wiadomość
        // jeżlei nie to wiadomość
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your number: ");
        int numberFROMuser = scanner.nextInt();
        if (zajecia4.isEven(numberFROMuser)) {
            System.out.println("Your number is even");
        }else {
            System.out.println("your nuber is odd");
        }
    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name");
        String name = scanner.nextLine();
        System.out.println("Please insert your last name");
        String lastName = scanner.nextLine();
    }

}