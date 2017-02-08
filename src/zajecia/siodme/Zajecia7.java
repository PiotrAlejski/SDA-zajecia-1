package zajecia.siodme;

import java.util.Random;

/**
 * Created by RENT on 2017-02-08.
 */
public class Zajecia7 {


    public static void main(String[] args) {
    //    int[] array = stringStatistics("adasdasdaddadz");
     //   printStringStatistic(array);
     //   String randomString = randomLowerCase(100);
      //  int[] ints = stringStatistics(randomString);
      //  printStringStatistic(ints);
        String string = "Ala ma 2 koty i 3 psy";
     //   String convertedSpaceString = convertSpace(string);
      //  System.out.println(convertedSpaceString);
       //   String reversString = reverseString(string);
       // System.out.println(reversString);
        int sum = sumFromString(string);
        System.out.println("Ala ma " + sum + " zwierząt");
    }

    public static int sumFromString(String message) {
    char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if ( charArray[i] > 48 && charArray[i] < 58) {
                sum += charArray[i] - 48;
            }

        }

        return sum;
    }


    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i -1]) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String message) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            chars[i]= chars[chars.length - i - 1];
            chars[chars.length - i - 1] = tmp;
        }
        return String.valueOf(chars);
    }


    public static String convertSpace(String message) {
        char[] charArray = message.toCharArray();
        for ( int i = 0; i < charArray.length; i++  ) {
            if ( charArray[i]== 95 ) {
                charArray[i] = ' ';
            }
        }
        return String.valueOf(charArray);
    }




    public static String randomLowerCase(int size) {
        Random random = new Random();
        char[] chars = new char [size];
        for (int i = 0; i < chars.length; i++ ) {
            int generatedValue = random.nextInt(26)+ 97;
            chars[i] = (char) generatedValue;
        }
        return String.valueOf(chars);
    }

    public static String randomLowerCaseII(int size) {
        Random randon = new Random();
        String tmpMessage = "";
        for (int i = 0; i < size; i++) {
            int generatedValue = randon.nextInt(26) + 97;
            String generatedValueAsString = String.valueOf((char) (generatedValue));
            tmpMessage += generatedValueAsString;

        }
        return tmpMessage;
    }







    public static int[] stringStatistics(String message) {
        int[] statisticsArray = new int[26];
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                int index = charArray[i] - 97;
                statisticsArray[index]++;
            }
        }
        return statisticsArray;
    }

    public static void printStringStatistic(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }


}
