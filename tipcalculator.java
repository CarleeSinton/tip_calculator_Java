import java.util.*;
import java.util.Scanner;
public class tipcalculator
{
    public static void main(String[] args)
    {
        double num1=0.0;
        double num2=0.0;
        double percentage=0.0;
        double answer=0.0;

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Please enter bill total: ");
        num1 = scanObject.nextDouble();
        System.out.println("Please select a percentage: ");
        System.out.println("10%");
        System.out.println("15%");
        System.out.println("20%");
        num2 = scanObject.nextDouble();
        System.out.println("10%");

        percentage = num1*(num2/100);
        answer = num1 + percentage;


        System.out.println(num1+" + "+percentage+" = "+answer);
    }
}
