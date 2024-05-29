public class AverageCalculator
{
    public static void main(String[] args)
    {
        int a = 7;
        int b = 1;
        int c = 2;
        int d = 4;

        // int average = calculateAverage(a, b, c, d);

        double average = calculateAverage(a, b, c, d);

        System.out.println("Average: " + average);
    }

    private static double calculateAverage(int a, int b, int c, int d)
    {
        int sum = (a + b + c + d);
        double average = (double)sum / 4;

        return average;
    }
}