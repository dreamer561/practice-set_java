import java.util.*;
public class evenodd {
    static boolean check(int num){
        return(num%2==0);
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number  :");
 int num=input.nextInt();
 if(check(num))
 System.out.println("The Number s even .");
 else
 System.out.println("The Number s odd .");



    }
    
}
