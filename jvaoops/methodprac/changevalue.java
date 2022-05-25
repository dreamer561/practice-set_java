package methodprac;

import java.util.Arrays;

public class changevalue {
    public static void main(String[]args){
        //creating an aray
        int[]arr={1,2,3,4,5,6};
        change(arr);
        arr[3]=43;
        System.out.println(Arrays.toString(arr));
    }
    
static void change(int[]nums){
    nums[0]=22;
}
}
