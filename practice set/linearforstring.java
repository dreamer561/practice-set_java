public class linearforstring {
    public static void main(String[]args){
        int temp=0;
        String[]arr={"bkbibhesh","rahul","aman","joe"};
        String item="rahul";
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(item)){
                System.out.println(i);
                temp+=1;
            }
        }
        if(temp==0){
            System.out.println("item not found");
        }
    }
    
}
