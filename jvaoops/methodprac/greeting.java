package methodprac;

 class greeting {
    public static void main(String[]args){
        int i=0;
        while(i<=5){
            i++;
            greeting();
        }
      
       // break(i==5);

    }
    static void greeting(){
        System.out.println("Hello method");
    }
    
}
