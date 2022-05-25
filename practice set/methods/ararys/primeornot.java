import java.util.Scanner;
public class primeornot {

    static boolean checkprime(int n){
        if(n<=2) return false;
        boolean ans=true;
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                ans =false;
                break;
            }
            i++;
        }
        return ans;
    }
    static void rightshift(int n){
       // System.out.println(rightshift);
        int shift_right= n;
        System.out.println(n >> 1);
    }
    public static void main(String[]args){
       rightshift(10);

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=input.nextInt();
        if(checkprime(num))
         System.out.println("Given num is prime");
         else
         System.out.println("Siven num is not prime");


    }

    
}
