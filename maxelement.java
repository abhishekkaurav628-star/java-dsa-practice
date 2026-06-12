public class maxelement {
    public static void main(String[] srgs) {
        int arr[] = { 10, 2, 50, 5, 2 };
        // int count = 0;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max elemnet :" + max);

    }

}
