
    import java.util.*;
    public class pattern2 {
        static void pattern2(int n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++ ) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        public static void main(String[]args){
            System.out.println("enter range to pritnt *");
            Scanner input=new Scanner(System.in);
            int n= input.nextInt();
            pattern2(n);
        }
    }
    
