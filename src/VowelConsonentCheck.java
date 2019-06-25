import java.util.Scanner;
import java.lang.String;

public class VowelConsonentCheck {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter letter");

        String str = myObj.nextLine();
        for (int i = 0, n = str.length(); i < n; i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    System.out.print("vowel ");
                else
                    System.out.print("consonant ");
            } // error check


            else {
                System.out.println("wrong format");
            }
        } //iteration
    } // main
}// class