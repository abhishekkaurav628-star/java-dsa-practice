import java.util.LinkedList;
public class Linklist {
    public static void main(String[] args) {
        
        LinkedList<Integer> obj1 = new LinkedList<>();
        obj1.add(4);
         obj1.add(3);
          obj1.add(2);
          obj1.add(1);
          int max = 0;
          for (Integer integer: obj1) {
            System.out.println(integer);
            
          }
          obj1.add(5);
          System.out.println(obj1);
          obj1.set(1, 5);
          System.out.println(obj1);
          obj1.remove(2);
          System.out.println(obj1);
          


        
    }
    
}
