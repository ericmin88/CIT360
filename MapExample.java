import java.util.*;
public class MapExample {

   public static void main(String[] args) {
      Map date = new HashMap(); 
      date.put("Independence Day", "July 4th");
      date.put("Christmas", "December 25");
      date.put("Halloween", "October 31");
      date.put("My Birthday", "June 14");
      
      Map color = new HashMap(); 
      color.put("red", "#ff0000");
      color.put("blue", "#0000ff");
      color.put("yellow", "#ffff00");
      

      System.out.println();
      System.out.println("Dates");
      System.out.print("\t" + date);
      System.out.println();
      System.out.print("Colors");
      System.out.println();
      System.out.print("\t" + color);
   }
}