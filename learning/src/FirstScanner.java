import java.util.Scanner;

public class FirstScanner
{
    int sum (int a, int b)
    {
        return a + b;
    }
    public static void main (String[] args)
    {
        FirstScanner aux = new FirstScanner();

        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int a = sc.nextInt();

        System.out.println("Second number: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + aux.sum(a, b));
    }
}