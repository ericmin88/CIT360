import java.util.*;
public class TreeExample {

   public static void main(String args[]) {
 
     TreeSet color = new TreeSet();
     color.add("Blue");
     color.add("Red");
     color.add("Orange");
     color.add("Blue");
     
     System.out.println("List of Colors");
     System.out.println(color);
     
     
     color.remove("Red");
     System.out.println();
     System.out.println("With red Removed");
     System.out.println(color);
     
     TreeSet numbers = new TreeSet();
     numbers.add(1);
     numbers.add(5);
     numbers.add(3);
     numbers.add(3);
     System.out.println();
     System.out.println("List of Numbers");
     System.out.println(numbers);
     
     
     numbers.remove(3);
     System.out.println();
     System.out.println("With 3 Removed");
     System.out.println(numbers); 
   }
}