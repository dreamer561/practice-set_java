import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        //java switch statement
         System.out.println("Enter no of month");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        String months="";
        
        switch(num){
          
            case 1:months="JAN";break;
            case 2:months="FEB";break;
            case 3:months="MAR";break;
            case 4:months="APR";break;
            case 5:months="MAY";break;
            default: System.out.println("error");
            }
            System.out.println(months);
    }
}
