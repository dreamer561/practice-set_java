import java.util.*;
public class voteeleg {
    static boolean vote(int a){
        return (a>=18);
    }
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your Age :");
        int age=input.nextInt();
        if(vote(age))
        System.out.println("You are Eligible . ");
        else
        System.out.println("You are Not Eligible ! ");

    }
    
}
