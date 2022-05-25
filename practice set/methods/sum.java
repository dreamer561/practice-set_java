public class sum {
    public static void main(String[]args){


        int sum=add(23,3,56);
 System.out.println(sum);  

       String name=name("bibhesh");
       System.out.println(name);
        

    }

    static int add(int i, int j, int k) {
       int sum=i+j+k;
        return sum;
    }
    static String name(String naam){
        String name="hii bkbibhesh";
        return name;
    }
}