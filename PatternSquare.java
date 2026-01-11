// import java.util.Scanner;

// public PatternSquare {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of n : ");
//         int n = sc.nextInt();
    
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print("*");
//             } 
        
//             System.out.println();
//         }
//         sc.close();
        
//     } 
// }




import java.util.Scanner;

public class PatternSquare {
    static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
     
        int testCaseValue = 1;

        int t = sc.nextInt();   
        for (int i = 0; i < t; i++) {
          
            System.out.print("Enter " + testCaseValue + " test case value here : " );
            int n = sc.nextInt(); 
            print1(n);
            System.out.println("Test case  : "  + testCaseValue  + "  executed");
            System.out.println("--------------------------");
            testCaseValue ++ ; 
        }

   

        sc.close();
    }
}
