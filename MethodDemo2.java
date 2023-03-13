public class MethodDemo2 {
   public static void main(String[] args) { //psvm
      int [][]z = { {0,1,1,0,1,1},
                       {0,1,1,0,0,0},
                       {1,0,0,0,0,1},
                       {0,0,0,1,1,1},
                       {1,0,1,1,1,1},
                       {1,0,1,1,1,1} };       
      int []v = findXY(z, 3);  // v[0] = 3, v[1] = 3
      System.out.println("(" + v[0] + "," + v[1] + ")" );  // (3,3)
   }
   public static int[] findXY(int [][]d,int n) {
      int []a = {-1,-1};      
      for(int r=0; r<d.length-n+1; r++) {
         for(int c=0; c<d[r].length-n+1; c++) {
            int count = 0;
            for(int j=r; j<r+n; j++) {
               for(int k=c; k<c+n; k++) {
                  if( d[j][k] == 1 ) {
                     count++;
                  }
               }
            }
            if( count == (n*n) ) {
               a[0] = r;
               a[1] = c;   
               return a;
            }
         }
      }      
      return a;
   }
   public static void print1D(int[] d) {
      String s = "[";
      for(int j = 0; j < d.length; j++) {
      s = s + d[j];
      if(j < d.length - 1 )
         s = s + ",";
      }
      System.out.println( s + "]");
   }

   public static void print2D(int[][] d) {
      for(int j = 0; j < d.length; j++) {
         print1D( d[j] );    
      }
   }
}

