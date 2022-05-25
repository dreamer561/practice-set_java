import java.util.Scanner;

public class oddeven {
    public static void main(String []args){
        int num;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number to check Even Or Odd");
        num=input.nextInt();
        
        if (num%2==0) {
            System.out.println("Given Number is Even");
        } else {
            System.out.println("Given Number is Odd");
        }
    }
    
}
