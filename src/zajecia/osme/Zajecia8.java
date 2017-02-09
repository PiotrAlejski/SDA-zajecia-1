package zajecia.osme;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
     //   System.out.println(factorial(100));
     //   System.out.println(factorialRecursion(8));
    //   System.out.println(FibonacciNumber(10));
        System.out.println(FibonacciNumberRec(6));

    }

    public static int FibonacciNumberRec(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return FibonacciNumberRec(index -2) + FibonacciNumberRec(index - 1);

    }

    public static int FibonacciNumber(int index) {
        int left = 0;
        int right = 1;
        int result = 0;
        for (int i = 2; i <= index ; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        return result;
    }


    public static long factorial(int number) {
        // metoda tworzenia silni
        long tmp = 1;
        for (int i = 1; i <= number; i++) {
            tmp *= i;

        }
        return tmp;
    }

    public static long factorialRecursion(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        return number * factorialRecursion(number -1);
    }
}
