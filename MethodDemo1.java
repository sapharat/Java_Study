public class MethodDemo1 {
   public static void main(String[] args) { //psvm
      //int [][]z = new int[3][4];
      int [][]zz = { {2,3,4},
                        {7,8,1} };
//      int [][]zzz = { 2,3,4,7,8,1 };
      int l = zz.length;
      int [][]zzz = { {2,3},
                          {7,8,1},
                          {4} };
      print2D(zz);
      System.out.println("===========");
      print2D(zzz);
      System.out.println("===========");
      //print2D(z);
      int [][]z = {{0,1,1,0,1},{0,1,1,0,0},{1,0,0,0,0},{0,0,1,1,1},{1,0,1,1,0}}; 
      int []v = findXY(z);  // v[0] = 3, v[1] = 2
      System.out.println("(" + v[0] + "," + v[1] + ")" );  // (3,2)
   }
   public static int[] findXY(int [][]d) {
      int []a = {-1,-1};      
      for(int r=0; r<d.length-1; r++) {
         for(int c=0; c<d[r].length-1; c++) {
            if( d[r][c] == 1 && d[r][c+1] == 1 &&
                d[r+1][c] == 1 && d[r+1][c+1] == 1 ) {
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


