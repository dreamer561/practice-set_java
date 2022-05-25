import java.util.*;
public class maxarrInputfact {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int[]arr=new int[3];
        //arr[0]=1;
        //arr[1]=34;
        //arr[2]=14;
        //arr[3]=78;
        //arr[4]=17;
        //arr[5]=19;
        //for(int i=0;i<arr.length;i++){
        //System.out.print(arr[i]);
    //}
    for(int i=0;i<arr.length;i++){
        arr[i]=input.nextInt();
       // System.out.print(arr[i]);
    }
    int max=0;
    if(arr[0]>arr[1]){
        max=arr[0];
    }if (arr[2]>arr[1]){
        max=arr[2];
        System.out.println(max);
    } 
    //facto of max 5*4*3*2*1=fact max=5 
    int result=1;
    int fact=1;
    while(result  <= max){
        fact*=result;
        result++;
    }
    System.out.println(fact);
        
    }
    }
    

