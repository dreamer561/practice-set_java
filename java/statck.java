import java.util.*;
class stack{
    public static void main(String[]args){
        Stack<Integer> RolNos=new Stack<>();

        //perform push operation

        RolNos.push(11);
        RolNos.push(13);

        System.out.println(RolNos.peek());
        int k=RolNos.pop();
        System.out.println(k);
    }
}
