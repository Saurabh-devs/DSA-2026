
//-----------Normal Logic---------------
// import java.util.Scanner;


// public class _1_count_number_of_digits {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter any number : " );
//          int n = sc.nextInt();
//          System.out.println(n);

//          int count = 0;
//          while(n!=0){
//          n = n/10;
//          count++;
//          }
//          System.out.println("total digits are : " + count);
//          sc.close();
            
//     }
// }




//-----------Normal Logic---------------
import java.util.Scanner;
public class _1_count_number_of_digits {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any number : " );
         int n = sc.nextInt();
         System.out.println(n);
         n= Math.abs(n); 
         System.out.println(n);// will convert negative number in positive
         int count = (n==0) ? 1 : 0 ; 
         while(n!=0){
         count++;
         n = n/10;
         }
         System.out.println("total digits are : " + count);
         sc.close();
            
    }
}