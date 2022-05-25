//import java.lang.reflect.Array;
import java.util.*;
//import java.util.Scanner;
public class colsize {
    public static void main(String[]args){
       int [][] arr={{1,2,3,4},{4,5},{799,45,88}};

       Scanner input=new Scanner(System.in);
       System.out.println(arr.length);
       for(int row=0;row<arr.length;row++){
           for(int col=0;col<arr[row].length;col++){
               System.out.println(Arrays.toString(arr[row]));
           }

       }

    }
    
}
