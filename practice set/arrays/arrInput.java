import java.util.*;
class arrayInput{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();

        int []input=new int[size];
        for(int i=0;i<size-1;i++){
            input[i]=s.nextInt();
        }
        for(int i=0;i<size-1;i++);{
        System.out.print(input[size]);
    }
        System.out.print(" ");
    }
}