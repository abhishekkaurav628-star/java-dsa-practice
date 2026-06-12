import java.util.Scanner;
public class evenodd1 {
    public static void main(String[] args){
        // int arr[] = {1,2,3,4,6,4,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int even =0;
        int odd =0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                // System.out.println("even");
                even++;
                
            }else{
                // System.out.println("odd");
                odd++;
                
            }
            
        }
        System.out.println("even = "+even);
        System.out.println("odd = "+odd);
    }
    
}


