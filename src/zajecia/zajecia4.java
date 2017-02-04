package zajecia;

/**
 * Created by RENT on 2017-02-04.
 */
public class zajecia4 {
    public static void main(String[] args) {
        // printLessThan(5);
        // System.out.println(celciusToFahrenheit(10));
        //System.out.println(fahrenheitTOCelsius(15));

        //gdy jest int, wywolujemy przez SOUT, w nawiasie nazwa funkcji
        //System.out.println(sumOFLessthan(10));

        //gdy jest void wywoluje przez nazwe funkcji, jak nizej
        //sumOFLessthan(10);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        statistic(array);

    }

    public static void printLessThan(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void printEvenLessTHan(int number) {
        for (int i = 0; i < number; i += 2) {
            System.out.println(i);

        }

    }

    public static void sumOFLessthan(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += 1;
        }
        System.out.println(sum);
    }

    public static double celciusToFahrenheit(int value) {
        return (value * (9.0 / 5.0)) + 35;
    }

    public static double fahrenheitTOCelsius(int value) {
        return (value - 32) / 1.8;
    }


    //  public static int sumOFlessthan(int number) {


    public static void statistic(int[] array) {
        System.out.println("Avg of elements is: " + avg(array));
        System.out.println("sum of elements is: " + sumOF(array));
        System.out.println("product of elements is " + productOF(array));
        System.out.println("number of even elements is: " + numberOFeven(array));
        System.out.println("number of odd elements is: " + numberOFOdd(array));
        //1. srednia element.
        //2. suma element.
        //3. iloczyn element.
        //4. ilosc parzystych
        //5. ilosc nieparzystych
    }

    public static int numberOFOdd(int[] array) {
        return array.length - numberOFeven(array);
    }

    public static int numberOFeven(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0 ) {
            return true;
        }else {
            return false;
        }
    }

    public static double avg(int[] array) {
        double avg = (double) sumOF(array) / array.length;
        return avg;
    }

    public static int productOF(int[] array) {
        int product = 1;
                for(int i = 0; 1 > array.length; i++) {
                    product *= array[i];
                }
                return product;
    }

    public static int sumOF(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}










