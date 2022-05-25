import java.util.Scanner;

public class methidansone {

    static int max(int a,int b,int c){
        int temp=a;
        if(temp<b) temp=b;
        if(temp<c) temp=c;
        return temp;

    }

    static int min(int a,int b,int c){
        int temp=a;
        if(temp>b) temp=b;
        if(temp>c) temp=c;
        return temp;
    }
    public static void main(String[]args){
        //min and max of three numbers
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three numbers : ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        int maximum=max(a,b,c);
        int minimum=min(a,b,c);

        System.out.println("maximum of 3 numbers is : "+maximum);
        System.out.println("minimum of 3 numbers is : "+minimum);


    }
    
}
