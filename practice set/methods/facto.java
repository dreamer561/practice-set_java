class methoda{
    static int fact(int n){
     int i=1;
     int factorial=1;
     while(i<=n){
         factorial*=i;
         i++;
     }
        return factorial;
        
    }
    //to find ncr!
    public static void main(String[]args){
     int nume=fact(7); 
     int r=(3); 
     int den=fact(nume-1); 
        System.out.println(nume/r*den);
    }
}