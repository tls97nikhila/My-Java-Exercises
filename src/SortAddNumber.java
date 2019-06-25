import java.util.*;

public class SortAddNumber {

    public static boolean sort(int input) {
        int i=0;
        List<Integer> n_list=new ArrayList<>();
        while(input!=0){
            int rem=input%10;
            n_list.add(rem);
            input=input/10;
        }
        Collections.sort(n_list);
        Collections.reverse(n_list);

        for ( i=0;i<n_list.size();i++){
            System.out.print(" "+n_list.get(i)); // descending order list
        }

        int sum=0;
        for (i=0;i<n_list.size();i++){
            if(n_list.get(i)%2==0){
                sum=sum + n_list.get(i); //sum of even numbers
            }

        }
        System.out.println(" ");
        System.out.println("Sum of even numbers:"+sum);
        if(sum>15)
            return true;
        else
            return false;

    }
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.println("enter number");
        int input= line.nextInt();

        boolean output=sort(input);
       System.out.println(output);
    }


}

