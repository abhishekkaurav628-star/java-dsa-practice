import java.util.*;
public class sumofarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Array elements :");
        // int arr[] = {1,2,5,6,4};
        // int sum =0;
        for(int i=0; i<arr.length; i++){
            //  sum += arr[i];
            arr[i] = sc.nextInt();
        }
        int sum =0;
      
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum = " + sum );

    }
    
}

