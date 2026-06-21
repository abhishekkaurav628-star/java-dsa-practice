public class Binarysearch {
    public static void main(String[] args){

        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int temp =0;
        int element = 80;
       int i = arr.length-1;

       boolean found = false;
       while(temp<=i){

       int mid = (temp+i)/2;

         if(element==arr[mid]){
            System.out.println(" found the elemnet:"+mid+" index value:");
            found = true;
            

         }
         if(element>arr[mid]){

         temp = mid+1;

        }else{

         i = mid -1;

    }
}
if(!found)
    System.out.println("element not found :");
    }
}

