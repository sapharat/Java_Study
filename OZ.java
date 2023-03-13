
public class OZ {
    public static void main(String[] args) {
        int []d  = {11,2,31,4,1,65,7,1,9,0};          
        int []x = inRange( d, 0, 2 );
        for(int i=0 ; i<x.length ; i++)
            {
                System.out.print(x[i]+" ");
            }
    }
    public static int [] inRange(int []d,int a,int b) {
        int s = b-a+1;
        int []t = new int [s];
        if(b>a){
        for(int c = 0,count=0; c<=d.length-1;c++){
            if(c>=a&&c<=b){
               t[count] = d[c];
                count++;
            }    
        }
        }
        else {
            int []m = {};
            return m;
        }
     return t;
    }
}
