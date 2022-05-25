package Stingr;

public class Stringchq {
    public static void print(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            
            
        }
    }
    public static void main (String[]args){
    

        String str="bkbibhesh";
        print(str);
        System.out.println(str.length()); 
        System.out.println(str.charAt(5)); 
        System.out.println(str.substring(1, 4)); 
        System.out.println(str.contains("l")); 
    }   
}
