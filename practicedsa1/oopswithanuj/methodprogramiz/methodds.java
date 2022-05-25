import java.util.Scanner;
class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the size of array : ");
       // int n=sc.nextInt();
       int n=3;
        int[]arr=new int[n];
        System.out.println("Enter the elements of array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
        }
        
        
     
     int temp;
     
     for (int i=0;i<arr.length;i++)
     for (int j=i+1;j<arr.length;j++)
     
   if(arr[i]<arr[j]){
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       
      
   }

      System.out.println("maximum element is :-"+arr[0]);
    }
}