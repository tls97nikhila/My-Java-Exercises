import java.util.Scanner;

public class ReverseNum {

    public static String reversel(String input){
        if(input == null || input.isEmpty()){
            return input;  //empty inpput
        }
        String reverse = "";
        for(int i = input.length() -1; i>=0; i--){
            reverse = reverse + input.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.println("enter word");
        String input= line.nextLine();
        String output;
        output=reversel(input);
        System.out.println(output);

    }

}
