package zajecia.siodme;

import java.util.Random;

/**
 * Created by RENT on 2017-02-08.
 */
public class Zajecia7 {


    public static void main(String[] args) {
        int[] array = stringStatistics("adasdasdaddadz");
        printStringStatistic(array);
        String randomString = randomLowerCase(100);
        int[] ints = stringStatistics(randomString);
        printStringStatistic(ints);
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
