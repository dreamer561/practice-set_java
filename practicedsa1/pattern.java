import java.util.*;
class pattern1{
    //int num=new num(int n);
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number to print Pattern");
   int n=sc.nextInt();
   for (int i = 0; i < n; i++) {
   for(int j=0;j<i;j++)
       {
        for (int k = 0; i < n; i++) {
            for(int l=0;j<i;j++)
            {
           System.out.print("*");
    }
     System.out.println();
   }
   }

   }
}
}