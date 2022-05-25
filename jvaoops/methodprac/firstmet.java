package methodprac;

import java.util.Scanner;

class firstmet {

    public static void main(String [] args)
{
       Scanner input=new Scanner(System.in);

       System.out.println("Enter NUm to find percent");
         double i=input.nextDouble();
         double discountper=discountcal(i);
         System.out.println(discountper+"% ");

         m1(55);
         m2(43);
         m3(22);
         
     }
static double discountcal(double num){
     num/=100;
     return num;
 
}

     static void m1(int num1){
         System.out.println("i am num 1 or method 1");

     }

     
     static void m2(int num2){
         int k=45;
        System.out.println(k);

    }
    static void m3(int num1){
        System.out.println("i am num 3 or method 3");

    }
 }


