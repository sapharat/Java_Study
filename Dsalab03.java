
public class Dsalab03 {
    public void shuffle  (int []d){
        for(int i=0;i<d.length;i++){
            d[i] = (int)(Math.random()*100);
        }
        for(int i = 0;i<d.length;i++){
            int ran = i+(int)(Math.random()*(d.length-i));
            int tme = d[i];
            d[i] = d[ran];
            d[ran] = tme;
        }
    }
    
    public void remove(int []d ,int i){
        for(int j=i;j<d.length-1;j++){
            d[j] = d[i+1];  
        }
        d[d.length-1] = 0;
    }
    
    public void insert(int [] d, int i, int x){
        for(int j=i;j<d.length;j++){
            int tmp = x;// tmp = 56
            x = d[j];//x = 2
            d[j] = tmp; //d[2]=56
        }
    }
    
    public int[] maxmin(int d[]){
       int p[] = {0,0};
       int Max = d[0]; //
       int Min = d[0];
       for(int i = 1 ; i <d.length;i++){
       if(d[i]>Max){
           Max = d[i];
       }
       }
       for(int j = 1 ; j <d.length;j++){
       if(d[j]<=Min){
           Min = d[j];
       }
       }
       p[0] = Max;
       p[1] = Min;
       return p ;
    }
    
    public  void print1D(int []d) {
        String s = "[";
        for(int j=0; j<d.length; j++){
         if( j < d.length-1) 
            s = s + d[j] + ",";
         else 
            s = s + d[j];
      }
      System.out.println( s + "]");
   }
}

