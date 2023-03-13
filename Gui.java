import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Gui{
    public static void main(String [] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scan.nextLine();
        System.out.print("Enter answer: ");
        double ans = scan.nextDouble();
        mathrandom(ans);
    }
    public static double mathrandom(double c) {
        double z , x , result = 0;
        int correct = 0;
        char operator[] = {'+', '-', '*', '/'};
        char op;
        int id, score = 0;
        while (correct < 100) {
            z = (int) (1 + (Math.random() * 12));
            x = (int) (1 + (Math.random() * 12));
            id = (int) (Math.random() * 4);
            op = operator[id];
            System.out.println(z + " " + op + " " + x);
            
            switch (op) {
                case '+':
                    result = z + x;
                    break;
                case '-':
                    result = z - x;
                    break;
                case '*':
                    result = z * x;
                    break;
                case '/':
                    result = z / x;
                    break;
            }
            if (result == c) {
                correct += 1;
                System.out.println("Correct!");
                score += 1;
            } else {
                correct =+ 1 ;
                System.out.println("Incorrect");
                score = 0;
            }
        }
        return score;
    }

}