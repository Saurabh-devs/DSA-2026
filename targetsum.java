// public class targetsum {
//      public static void main(String[] args) {

//         int target = 9;
//         int arr[] = {1,2,5,7,0,23};

//       int i = 0;
//       int n = arr.length-1;
//       int j = n;
 

//       int sum = i + j;
//       if(sum == target){
//          System.out.println(i + " " + j );
//       }
//       else if(sum>target){
//          for(j=n; j>0; j--){
//         while( sum == target)   {
//          System.out.println("Greater" + i + " " + j);
//         }
//          }
//       }

//       else if (sum<target){
//          for(i=1; i<n; i++){
//             while(target == sum){
//                System.out.println("Less" + i + " " + j );
//             }
//          }
//       }
//       else{
//          System.out.println("Not found");
//      }
   
//      }
// }


import java.util.Arrays;

public class targetsum {
    public static void main(String[] args) {

        int target = 9;
        int[] arr = {1, 2, 5, 7, 0, 23};

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        boolean found = false;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println(arr[i] + " " + arr[j]);
               
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
