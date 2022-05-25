public class binarysearch {
    public static void main(String[]args){
        int[]a={1,3,4,5,6,7,8,9,11,12,13,14};
        int search=118;
        int start=0;
        int end=a.length-1;
        int mid=(start+end)/2;
        while(start<=end){
           if(a[mid]==search){
               System.out.println("index ;;"+mid);
               break;
           }else if(a[mid]<search){
               start=mid+1;
           }else{
               end=mid-1;

           }
           mid=(start+end)/2; 
        }
        if(start>end){
            System.out.println("element nort found");
        }

    }
    
}
