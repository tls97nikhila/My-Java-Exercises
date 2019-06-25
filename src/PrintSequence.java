import java.util.Scanner;

public class PrintSequence {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter iterator");

        int iterate = myObj.nextInt();
        for(int i=1;i<=iterate;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
        } // end  outer for
    }//end main

}