import java.util.Scanner;

public class Mutiples {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        int sum = 0;
        for (int j = 1; j < k   ;  j++) {
         if(j % 3  == 0 || j % 5 ==0  )
             sum = sum +  j ;   
        }
              System.out.println(sum);
     }
}
