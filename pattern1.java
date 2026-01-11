//      *
//     ***
//    *****
//   *******
//  *********





public class pattern1 {
    public static void main(String[] args) {
        int n= 5;
        
        for(int i =0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
             for(int k=0; k<i+1; k++){
                System.out.print("*");
             }
             for(int l=0; l<i; l++){
                System.out.print("*");
             }
            System.out.println();
        }
         
    }
}
