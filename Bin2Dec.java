import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s =kb.next();
        int sum = 0;
        for(int k = s.length()-1, p = 0; k>=0 ;k = k-1 , p++){//5
        System.out.println( k ); 
        int d = Integer.parseInt(s.substring(k,k+1));
        System.out.println( d ); 
        int b = (int)( Math.pow(d*2, p) );
        System.out.println( b ); 
        sum = sum + b ;
        }
        System.out.println( sum );         
    }
}

