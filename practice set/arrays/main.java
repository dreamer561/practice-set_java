import java.util.Scanner;
//wrong program
public class main {
    public static void main(String[]args){
        int [] rolls=new int[5];
        String[] name=new String[5];

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Rolls  :-");
        for(int i=0;i<rolls.length;i++){
          rolls[i]=input.nextInt();
          System.out.print(rolls[i]);
        }
        System.out.println("Enter Names  :-");
        for(int i=0;i<rolls.length;i++){
            name[i]=input.next();
            System.out.print(name[i]);
          }
          for(String element:args){
              System.out.println(element);
          }
    }
    
}
