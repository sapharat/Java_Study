
import java.util.Scanner;


public class TestMetor {
    public static void main(String[] args) {
        sayWelcome(10,20);

        int x = 2;
        int y = 3;
        System.out.println("x + y = " + sum(3000,855222)); 
        System.out.println("10 + 20 = " + sum(10, 20));

    }

    private static void sayWelcome(int a,int b) {
        int h =a+b;
        System.out.println("Welcome to Calculator Program");
        System.out.println(a+" "+b);
        System.out.println(h);
    }
    
    private static int sum(int a,int b) {
        
        return a+b;
    }
}