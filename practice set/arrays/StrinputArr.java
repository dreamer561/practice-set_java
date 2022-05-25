import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StrinputArr {
   // private static int i;

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
       int[] arr=new int[5];
       for (int i = 0; i < args.length; i++) {
           arr[i]=input.nextInt();
          
       }
       System.out.println(Arrays.toString(arr));
       for (int j:arr){
           System.out.println(j);
       }
       String[]str=new String[5];
       for (int i=0;i<str.length;i++){
           str[i]=input.next();
       }
       
       System.out.println(Arrays.toString(str));
       str[1]="bkbibhesh";
       System.out.println(Arrays.toString(str));
    }
    
}
