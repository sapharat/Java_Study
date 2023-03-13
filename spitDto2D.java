/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author defok
 */
public class spitDto2D {
    public static void main(String[] args) {
        int v = x1(15,11);
        System.out.println(v+"");
//        String s1 = time("JAN", -20);
//        System.out.println(s1+"");
        
        
//        int v = numOfD("I am so glad that A","so");
//        System.out.println(v+"");
    }
//        String a = extraEND("Hi",3);
//        System.out.print(a+"");
//        int []d  = {2,0,0};
//        kArray(d,3);
//            for(int i=0 ; i<d.length ; i++)
//            {
//                System.out.print(d[i]+" ");
//            }
//        
//        int a=getPay(55);
//        System.out.println(a+"");
//        int k = diffByK(d, 1);
//        System.out.print(k+"");
        
    
    public static int[][] gety(int []y){
        int [][] a = new int [2][];
        for(int j = 0,count =0 ;j<y.length;j++){
            if(y[j] < 0){
               a[1][count] = y[j];
               count++;
            } 
        }
        for(int j = 0 ,count =0;j<y.length;j++){
            if(y[j] > 0 && y[j]/2==0){
               a[0][count] = y[j];
               count++;
            } 
        }
        return a;
    }
//    public static void kArray(int [ ]d,int k){//d(12345)
//        int n = d.length-1;    
//        while(n>k){
//            n = n-k;
//        }
//        int temp[] = new int [k-n];
//        for (int i =0 ; i < k-n;i++){
//            temp[i] = d[i];
//        }
//        for (int i = k - n;i<k;i++){
//            d[i-k+n] = d[i];
//        }
//        for (int i=0 ; i < k - n;i++){
//            d[i+n] = temp[i];
//        }
//}
//    public static int zeroPad(int n,int d) {
//             int m = n.length();
//             m = m-d;
//             int sum = n;
//             if(m<=0)
//                 return n;
//             for(int c = m;m<=0;m--){
//                     sum = sum+0;
//             }
//             return sum;
//        }
//    }
//    public static int sumOdd(int m) {
//       int a =0;
//       for(int n = 1;n<=m;n++){
//           if(!(n%2==0))
//               a = a + n;
//       }
//       return a;
//    }
//    public static int getPay(int hours) {
//    int sum =  0;
//        if(hours>30){
//           sum = 30 * 420;
//           int scrap = hours - 30;
//           scrap = scrap*88;
//           sum = sum+scrap;
//        }
//        else
//            sum = hours *420;
//        return sum;
//    }
//    public static String extraEND(String s,int k) {
//    String a = "";
//        if(s.length()>k){
//        a = s.substring(s.length()-k, s.length());
//    return a+a+a;
//    }
//    a = s+s+s;
//    return a;
//    }
//    public static int diffByK(int []d,int k){
//    int i = 0; 
//        for(int a=0,count = d.length-1;a<=count;a++){
//         for(int b=0;b<=count;b++){
//             int f = d[a]-d[b];
//             if(f==k)
//                 i++;
//         }
//    }
//        return i;
//    }

    
//    public static String time(String p,int k) {
//        int count = 0,m;
//        String []months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
//        for(int i=0;i<=months.length-1;i++){
//            if(p.substring(0, 3).equals(months[i]+"")){
//                count = i;
//                if(k>12||k<-12){
//                   m = k%12;
//                   count = m+count;
//                }
//                if(k<0&&k>-12){
//                    if(i+k<i){
//                      i=12;
//                      count = i+k;
//                    }
//                    
//                }
//                else{
//                count = k+count;
//                }
//            }
//        }
//        return months[count];
//    }
//    public static int diff(int b,int c) {
//        int A = b-c;//b=10 c =1
//        if(A<0){
//            A = -A;
//            return A;
//        }
//        if(b>c*7){ 
//                A = A*3;
//                return A;
//        }
//        if(b>c*3){//
//                A = A*2;
//                return A;
//        }
//        return A;
//    }
    public static int numOfD(String s,String d) {
        int k = 0 ;
        int sumd = 0 ; 
        String sd = s.toLowerCase(); 
        String vd = d.toLowerCase();       
        while( k < sd.length() ) {
            String t = sd.substring(k, k+1);
                if(vd.indexOf(t) > 0 ) {
                sumd++;
                }
            k++;
    }
        return sumd;
    }
    public static int x1(int s,int x2){
       int sum = 0;
       sum = (s*2)-x2;
        return sum;
       
}
}




