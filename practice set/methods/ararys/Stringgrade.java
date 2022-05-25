import java.util.*;
public class Stringgrade {

    static String grades(int n){
        if (n>=91 && n<100) return "AA";
        else if(n>=81 && n<90) return "AB";
        else if(n>=71 && n<80) return "BB";
        else if(n>=61 && n<70) return "BA";
        else if(n>=51 && n<60) return "BC";
        else if(n>=41 && n<50) return "CD";
        else return "Fail"; 
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter marks :");
        int marks =input.nextInt();
        System.out.println("Grades :"+grades(marks));


    }
    
}
