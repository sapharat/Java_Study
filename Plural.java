import java.util.Scanner;
public class Plural {
    public static void main(String[] args){
        Scanner kb = new Scanner (System.in);
        String s = kb.next().trim();//mos
        String vowels = "aeiou";
        int L =s.length();//L = 3
        if( L > 2 ){
            if(s.substring(L-=2,L).equalsIgnoreCase("ch")||
               s.substring(L-=1,L).equalsIgnoreCase("x")||
               s.substring(L-=1,L).equalsIgnoreCase("s"))
                s = s + "es";
            else if(s.substring(L-=1,L).equalsIgnoreCase("y")&&
                    vowels.indexOf( s.substring(0, L) ) < 0 ) 
                    s = s.substring(0, L-1) + "i" + "es"; 
            else 
                    s = s + "s";
        }
        System.out.println( s );
    }
}
