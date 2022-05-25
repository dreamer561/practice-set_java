import java.util.*;
public class maxelarray {
    public static void main(String[]args){
        int [] arr={45,65,64,545,45};
        System.out.println(maxele(arr));
        int [] ari={45,65,64,545,45};
        System.out.println(maxele(ari));
    }
    static int maxerange(int[]ari,int start,int end){
        int max=ari[0];
        for(int i=start;i<end;i++){
            if(ari[i]>max){
                max=ari[i];
            }
        }
        return max;
    }
    static int maxele(int[]arr){
        if(arr.length==0)
        return 0;

        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //method 222
   
    }
    
