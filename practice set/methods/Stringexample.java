import java.util.*;
public class Stringexample {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter yout name");
        String name=in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }
    static  String mygreet(String name){
        String message="Hello"+name;
        return message;

    }

static String greet(){
    String greeting="how are you";
    return greeting;
    
}

    
}
