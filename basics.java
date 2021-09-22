import java.util.Scanner;
class main{
 public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("hii enter 1st number :- ");
    int a=input.nextInt();
    System.out.println("hii enter 2nd number :- " );
    int b =input.nextInt();
    int c= a+b;
    if(a>b){
       System.out.println("Please input other number"); 
    } else{
        System.out.println(c);

    }
   
   
    System.out.println("hii your result is :- ");
    System.out.print(c);
}

}