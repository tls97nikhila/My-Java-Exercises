import java.util.Scanner;

public class TomnJerry {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");

        int num = myObj.nextInt();  // Read user input
        if((num>20 && num<=30)) {
            if(num%2==0){
                System.out.println("Tom"); //condition check

            }
            else{        System.out.println("Jerry");


            }

        }
        else
        {
            System.out.println("out of bounds ");

        }

    }
}