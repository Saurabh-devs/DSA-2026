public class Reverse {
     public static void main(String[] args) {
        int n = 476;
    
while(n>0){
    int  last = n%10;
    int reverse = 0;
         reverse= (reverse * 10) + last;
       
         n = n/10;
         System.out.print(reverse);
}
        

     }
}
