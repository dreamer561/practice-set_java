import java.util.Scanner;

public class prime {
    public static void main(String []args){
        int num;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number to check Prime Or Not");
        num=input.nextInt();
        
        if (num%num==0||num%1==0) {
            System.out.println("Given Number is Prime");
        } else {
            System.out.println("Given Number is Not Prime");
        }
    }
    
}
