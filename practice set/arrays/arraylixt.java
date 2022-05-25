import java.util.ArrayList;
import java.util.Scanner;
public class arraylixt {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>(10);


        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
           System.out.print("Enter");
           list.add(input.nextInt());
        
        }
        System.out.println(list);
        for(int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list);
    }
    
}
