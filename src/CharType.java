import java.util.Scanner;

public class CharType {
    public static void type(char ch){
        if(ch >= 48 && ch<= 57){
            System.out.println("Number");
        }
        else if(ch >= 65 && ch<= 90){
            System.out.println("Capital Letter");
        }
        else if(ch >= 97 && ch<= 122){
            System.out.println("Small Letter");
        }
        else{
            System.out.println("Special Char");
        }
    } // end of function type


    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.println("enter char");
        char input= line.next().charAt(0); // take single char input
        type(input);
    }

}
