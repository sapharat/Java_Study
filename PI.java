public class PI {
    public static void main(String[] args) {
        double PI = 0.0;
            for(int j = 1 , k =1 ; j < 400000 ; j = j+2, k = k+1 ){
                if( k % 2 ==0){
                PI =  PI - (1.0/j);
            }else{
                    PI = PI + (1.0/j) ;      
                }
            }   
            System.out.println("PI = " + (4*PI) );
    }
}
