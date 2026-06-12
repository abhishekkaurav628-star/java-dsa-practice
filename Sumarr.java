import java.util.*;

public class Sumarr {
    public static void main(String[] args) {
        // int[] arr = {};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {

            sum += arr[i];
        }
        System.out.println("Array sum:  " + sum);

        sc.close();

    }
}
