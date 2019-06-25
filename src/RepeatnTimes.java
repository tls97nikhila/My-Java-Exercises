import java.util.Scanner;

public class RepeatnTimes {
    private static void display(String string, int num){
        int str_len=string.length();
       int part1= str_len-num;
       for (int i=0;i< str_len;i++){
           System.out.print(string.charAt(i)); // first part of string
       }
       for(int i=0;i<num;i++){
           System.out.print(string.substring(part1));  // repeatetion part
       }

    }



    public static void main(String[] args){
        System.out.println("input 1");
        Scanner scanner=new Scanner(System.in);
        String input1=scanner.nextLine();
        System.out.println("input 2");
        int input2=scanner.nextInt();


        display(input1,input2);  // call function

    }

}
