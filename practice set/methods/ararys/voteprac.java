import java.util.*;
public class voteprac {
    static boolean vote(int a){
        return(a>=18);
    }
    public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("Enter your age");
int age=input.nextInt();
if(vote(age))
System.out.println("Eligible");
else
System.out.println("Not Eligible");
    }
    
}
