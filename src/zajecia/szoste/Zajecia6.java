package zajecia.szoste;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by RENT on 2017-02-07.
 */


public class Zajecia6 {

    public static void main(String[] args) {
        //    System.out.println(sumUntil(10));
        //    System.out.println(avgUntil(10));
         //System.out.println(cezarCode("WAR"));
        // System.out.println(cezarCode("Hello World"));
//        System.out.println(decodeCezarCode("XBS"));
        String wojna = "Wojna";
        String codded = cezarCode(wojna);
        System.out.println(decodeCezarCode(codded));

    }

    public static String decodeCezarCode (String messega) {
        return cezarCode(messega, -1);
    }

    public static String decodeCezarCode(String message, int key) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] - key);
        }
        return String.valueOf(charArray);
    }

    public static String cezarCode(String message) {
        return cezarCode(message, 1);
    }


    public static String cezarCode(String message, int key) {
        char[] charArray = message.toCharArray();
        for ( int i = 0; i < charArray.length; i++  ) {
            charArray[i] = (char) (charArray[i] + key);
        }
        return String.valueOf(charArray);
    }

    public static void calculator() {

        boolean flag = true;
        while (flag) {
            System.out.println("1. dodawanie");
            System.out.println("2. odejmowanie");
            System.out.println("3. mnozenie");
            System.out.println("4. dzielenie");
            System.out.println("0. koniec");
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Podaj dzialanie");
            int firstNumber = 0, secundNumber = 0;
            if (numberFromUser > 0 && numberFromUser < 4) {
                firstNumber = ZadaniaZeScannerem.getNumberFromUser(" Podaj pierwsza liczbe");
                secundNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj druga liczbe");
            }
            switch (numberFromUser) {
                case 1:
                    System.out.println(firstNumber + " + " + secundNumber + "=" + (firstNumber + secundNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + "-" + secundNumber + "=" + (firstNumber - secundNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + "*" + secundNumber + "=" + (firstNumber * secundNumber));
                    break;
                case 4:
                    if (secundNumber == 0) {
                        System.out.println("nie dzielimy przez 0");
                    } else {
                        System.out.println(numberFromUser + "/" + secundNumber + "=" + ((double) firstNumber / secundNumber));
                    }
                    break;
                case 0:
                    System.out.println("Koniec");
                    flag = false;
                    break;
                default:
                    System.out.println("Podano złą wartość");
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }


    public static int sumUntil(int number) {
        int steps = 0;
        int sum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromuser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromuser;
            steps++;
            if (sum > number) {
                flag = false;
            }
        }
        return steps;
    }

    public static int avgUntil(int avg) {
        boolean flag = true;
        int sum = 0;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromUser;
            counter++;
            if ((double) sum / counter > avg) {
                flag = false;
            }
        }

        return counter;
    }
}
