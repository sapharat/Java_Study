import java.util.Scanner;

public class MaxDiff {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = 0, v, max, min;
        v = max = min = kb.nextInt();
        if (v < 0) {
            c++;
        }
        for (int j = 1; j < n; j++) {
            v = kb.nextInt();
            if (max < v) {
                max = v;
            }
            if ( min > v) {
                min = v;
            }
            if (v < 0) {
                c++;
            }
        }
   
        System.out.println(max-min+ " " + c);
    }
}
