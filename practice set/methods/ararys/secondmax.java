public class secondmax {
    public static void main(String[]args){
        int []a={12,34,545,56,743,43};

        for (int i=0;i<a.length;i++){
        for (int j=i+1;j<a.length;j++){
            // temp=0;
            if(a[i]<a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    for (int i=0;i<a.length;i++){
        System.out.print(a[i]+ " ");
    }
        System.out.println("Second largest number is"+a[1]);
    }
    
}
