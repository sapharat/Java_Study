import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = n;
        for(int j =1; j <= n; j=j+1,c=c-1){
            for(int k=1; k <= n;k++){
                if(j==k ||  k==c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
