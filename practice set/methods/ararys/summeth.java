import java.util.*;

public class summeth {
    static int sum(int a , int b)
       { return a+b;
    }
    
public static void main(String[]args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter numbers to add : ");
    int c,d;
    c=input.nextInt();
    d=input.nextInt();
    System.out.println("Sum is :"+sum(c, d));

}   
}
