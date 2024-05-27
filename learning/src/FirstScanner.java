import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstScanner
{
    int sum (int a, int b)
    {
        return a + b;
    }
    public static void main (String[] args)
    {
        try
        {
            FirstScanner aux = new FirstScanner();

            Scanner sc = new Scanner(System.in);

            System.out.println("First number: ");
            int a = sc.nextInt();

            System.out.println("Second number: ");
            int b = sc.nextInt();

            System.out.println("Sum: " + aux.sum(a, b));
        }
        catch (InputMismatchException e)
        {
            System.out.println("ERROR: Input Mismatch");
        }
    }
}