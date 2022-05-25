import java.util.*;
public class areaofcircumference {
    static void solve(double r){
        double area=Math.PI*r*r;
        double cir=Math.PI*2*r;
        System.out.println("Circumfrance of circle :"+cir+"cm");
        System.out.println("Area of circle :"+area+"cm");

    }
    public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("Enter radious of circle : ");
double radious=input.nextDouble();
solve(radious);
    }
    
}
