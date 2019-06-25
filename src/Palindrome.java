import java.util.Scanner;
import java.lang.String;


public class Palindrome {

        private static boolean isPalindrome(long num) {
            long lastDigit, sum = 0, a;

            a = num;
            while (a > 0) {
                lastDigit = a % 10;
                sum = (sum * 10) + lastDigit;
                a = a / 10;
            }
            if (num == sum) {
                var b = true;
                return b;
            } else return false;

        }

        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter nuumber");
            long num = myObj.nextLong();
            long y = num;
            long  last, total = 0;

            if (isPalindrome(num)) {
                while (num > 0) {
                    last = num % 10;
                    if (last % 2 == 0) {
                        total += last;
                    }
                    num = num / 10;
                }
                if (total >= 25) {
                    System.out.println(y + " is palindrome and sum of even numbers is greater than 25");
                } else {
                    System.out.println(y + " is palindrome and sum of even numbers is less than 25");
                }


            } //end of isPalindrome if part
            else {
                System.out.println(y + " is not a palindrom");
            }
        } // end main
}   //palindrome class

