public class Bubblesort {
    public static void main(String[] args){
    int arr[] = {55,32,44,25,16};

    int temp =0;

    for(int i=1; i<arr.length; i++){
        for(int j=0; j<arr.length-i; j++){
            
        
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                
            }
        }
        //     System.out.println("sorted element: ");
            for (int num : arr) {
                System.out.print(num+" ");
                
                
            }
            System.out.println();
        
    }
}
}
