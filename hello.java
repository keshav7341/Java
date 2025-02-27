import java.util.ArrayList;
import java.util.Scanner;



public class hello{

    public static void main(String agrs[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int sam;
        System.out.println("Enter 5 values : ");
        for(int i=0;i<5;i++){
            sam=sc.nextInt();
            arr.add(sam);   
        }
        System.out.println("Values are :");
        for (Integer num : arr) {
            System.out.println(num);
        }


        System.out.println("Size is : "+ arr.size());
    }
}