import java.util.Scanner;
class month{
public static void main(String[]args){
//user input
int num1;
int sum=0;

Scanner sc=new Scanner(System.in);
System.out.println("enter numbers in range");
num1=sc.nextInt();
for(int i=0;i<=num1;i++);
sum +=i;

System.out.println("Sum of all numbers== "+sum);

}


}