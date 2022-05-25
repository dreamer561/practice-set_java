package methodprac;

class funoverloading {
    public static void main(String[]args){
       fun(22);
       fun("bkbibhesh");
       System.out.println(sum(2,3,4));
       System.out.println(sum(2,3));
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String j){
        System.out.println(j);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

    
}
