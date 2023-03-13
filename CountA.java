import java.util.Scanner;
public class CountA {
   public static void main(String [ ]args) {
      Scanner kb = new Scanner(System.in);
      System.out.print("String = ");
      String t = kb.nextLine( );
      int count = 0;
      for(int k=0; k < t.length(); k++){      
         if ( t.substring(k, k+1).equals("A") ||
              t.substring(k, k+1).equals("a") )
            count++;
      }
      System.out.println("Blank " + count + " number");
  }
}