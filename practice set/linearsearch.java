class linearsearch{
    public static void main(String[]args){
        int[]arr={2,4,3,45,565,76,7,6754,45};
        int i,target=76;
        int temp=0;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println(i);
                temp+=1;
            }
            
        }
        if(temp==0){
            System.out.println("item not found");
        }
    }
}