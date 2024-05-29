public class Main
{
    public static void main(String[] args)
    {
        System.out.println("main: ");

        a();

        System.out.println("end of main.");
    }

    static void a()
    {
        System.out.println("A: ");

        b();

        System.out.println("end of a.");
    }

    static void b()
    {
        System.out.println("B: ");

        for (int i = 1; i <= 3; i++)
        {
            c();
        }

        System.out.println("end of b.");
    }

    static void c()
    {
        System.out.println("C: ");

        Thread.dumpStack();

        System.out.println("end of c.");
    }
}