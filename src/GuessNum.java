import java.util.Random;
import java.util.*;
public class GuessNum {

    private static void guess(int instance_num){
        int guess_num;
        do{
            System.out.println("Guess number");
            Scanner in=new Scanner(System.in);
            guess_num=in.nextInt(); //input guess number every time
            if(guess_num == instance_num){
                System.out.println("Number guessed matches the original");
            }
            else if (guess_num > instance_num){
                System.out.println("Number guessed is greater than the original");

            }
            else if (guess_num < instance_num) {
                System.out.println("Number guessed less than the original");

            }
        }while(guess_num != instance_num);
    } // function guess

public static void main(String[] args){
    Random rand=new Random();
    int instance_num= rand.nextInt(50); // to genrate random num btm 1 to 50
    System.out.println(instance_num);
    guess(instance_num);
} // end main

} // end calss
