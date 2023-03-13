public class MethodDemo3 {
   public static void main(String[] args) { //psvm
      //int []z = {1,0,1,1,1,0,1,0,1,1}; // 1 = 70%, 0 = 30%
      int x = (int)(Math.random()*11 + 5 ); // 5x5, 6x6, ... ,15x15
      int [][]map = new int[x][x];
      for(int j=0; j<map.length; j++){
         for(int k=0; k<map[j].length; k++) {
            double c = Math.random();
            if( c > 0.29999999999 )
               map[j][k] = 1;
            else
               map[j][k] = 0;
         }
      }
      print2D(map);
      int []v = findXY(map, 3);  // v[0] = 3, v[1] = 3
      System.out.println("(" + v[0] + "," + v[1] + ")" );  // (3,3)
   }
   public static int[] findXY(int [][]d,int n) {
      int []a = {-1,-1};        
      for(int r=0; r<d.length-n+1; r++) {
         for(int c=0; c<d[r].length-n+1; c++) {
            boolean yes = true;
            for(int j=r; j<r+n; j++) {
               for(int k=c; k<c+n; k++) {
                  if( d[j][k] != 1 ) {
                     yes = false;
                     break;
                  }
               }
               if(!yes) break;
            }
            if( yes ) {
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
