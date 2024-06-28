import java.util.Scanner;

public class Contador
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        try
        {
            contar(x, y);
        }
        catch (Exception e)
        {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int a, int b) throws ParametrosInvalidosException
    {
        if (a > b)
        {
            throw new ParametrosInvalidosException();
        }
        else
        {

            int contagem = b - a;
                
            for (int i = 1; i <= contagem; i++)
            {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}