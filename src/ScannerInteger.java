import java.util.Scanner;
import java.lang.String;
public class ScannerInteger {

public static void main(String[] args) {
    System.out.println("enter num");
    int sum=0;
    do{
        Scanner scanner=new Scanner(System.in);
        int score;
        String line =scanner.nextLine(); // take input as scanner
        scanner=new Scanner(line); // in strings
        while (scanner.hasNext()){
            score=scanner.nextInt(); // save as integer in score and add to sum
            sum+=score;
        }

        if(sum <=-1){
            System.out.println("Error");
        }
        else
        {
            System.out.println(sum);
        }
    }while (sum!=-1);

    } //main ends
} // class ends