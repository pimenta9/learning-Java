import java.util.Scanner;

public class ContaTerminal
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = sc.next();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.print("Digite o saldo: ");
        float saldo = sc.nextFloat();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.print("sua agência é " + agencia + ", conta " + numero);
        System.out.println(" e seu saldo "+saldo+" já está disponível para saque.");
    }
}