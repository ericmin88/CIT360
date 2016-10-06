import java.util.*;

public class ListExample{
   public static void main(String[] args)
   {
  
      List<String> colors = new ArrayList<String>();
      colors.add("Blue");
      colors.add("Red");
      colors.add("Orange");
      colors.add("Pink");
      System.out.println("List of Colors");
      System.out.println(colors);
      
      
      colors.remove("Red");
      System.out.println();
      System.out.println("With red Removed");
      System.out.println(colors);
      
      List<Integer> numbers = new ArrayList<Integer>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(5);
      System.out.println();
      System.out.println("List of Numbers");
      System.out.println(numbers);
      
      
      numbers.remove(3);
      System.out.println();
      System.out.println("With 3 Removed");
      System.out.println(numbers);      
    }
}