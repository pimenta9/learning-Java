package educ.joao.first;

public class MyClass
{
    public static void main (String[] args)
    {
        String firstName = "João";
        String secondName = "Vitor";

        String fullName = fullName(firstName, secondName);

        System.out.println(fullName);
    }

    public static String fullName (String firstName, String secondName)
    {
        return firstName.concat(" ").concat(secondName);
    }
}