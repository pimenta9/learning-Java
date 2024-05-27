// this code was used to practice Exception creations and handling

import java.util.Scanner;

public class DivideNumber
{
    static void printNumber (float f) throws InvalidNumberException
    {
        if (f < 0 || f > 10)
        {
            throw new InvalidNumberException();
        }

        f = f / 2;

        System.out.println("Answer = " + f);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose a number beetween 1 and 10 to be divided by 2: ");
        float number = sc.nextFloat();

        try
        {
            printNumber(number);
        }
        catch (InvalidNumberException e)
        {
            System.out.println("Error!  X(  ");
        }
    }
}