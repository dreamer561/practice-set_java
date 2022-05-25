import java.util.*;
class add{
    static void  sum(int a,int b,int c){
        int ans=a+b+c;
        System.out.println("Sum of three numbers=="+ans);
          //return ans;
    }
    public static void main(String[]args){
       Scanner input=new Scanner(System.in);
       System.out.println("Enter three numbers to add__");
       int x=input.nextInt();
       int y=input.nextInt();
       int z=input.nextInt(); 
        sum(45,54,65);
        sum(x,y,z);
    }
}