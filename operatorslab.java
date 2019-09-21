package operatorslab;
import java.util.Scanner;
public class OperatorsLab {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        int x,y,z;
        System.out.println("How many feet tall are you?");
        x = in.nextInt();
        System.out.println("How many inches tall are you");
        y = in.nextInt();
        double finalresult = (x*12+y)*2.54;
        System.out.print("You are ");
        System.out.print(finalresult);
        System.out.println (" inches tal44l!");
    }
}
