import java.util.*;
public class methodpattern1 {
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        System.out.println("enter range to pritnt *");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        pattern1(n);
    }
}
