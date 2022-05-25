import java.util.Arrays;

class varargs{
    public static void main(String[]args){
        
     demo(4,5,4,4,5,4,4,5,4,4,5,4);   

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));

    }
}