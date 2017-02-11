package zajecia.osme;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
     //   System.out.println(factorial(100));
     //   System.out.println(factorialRecursion(8));
    //   System.out.println(FibonacciNumber(10));
     //   System.out.println(FibonacciNumberRec(6));
     //   String message = "ALa Ma Kota";
     //   System.out.println(switchCase(message));
     //   System.out.println(sumOfNumberDigital(525273));
     //   System.out.println(startsWith2("Ala ma kota", "Ala"));


    }

    //can throw exception
    public static boolean startsWith1(String message, String expression) {
        return message.startsWith(expression);
    }

    public static boolean startsWith2(String message, String expression) {
        return message.substring(0, expression.length()) .equals(expression);
    }

    public static int sumOfNumberDigital(int number){
        int sum = 0;
        while(number != 0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }


    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        return String.valueOf(charArray);
    }

      public static String swithCaseWithBuilde(String message) {
          StringBuilder stringBuilder = new StringBuilder();
          for (int i = 0; i < message.length(); i++) {
              char tmp = message.charAt(i);
              if (tmp >= 65 && tmp <= 90) {
                  stringBuilder.append((char)(tmp + 32));
              }else if (tmp >= 97 && tmp <= 122) {
                  stringBuilder.append((char) (tmp - 32));
              }else {
                  stringBuilder.append(tmp);
              }
          }
          return stringBuilder.toString();

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
