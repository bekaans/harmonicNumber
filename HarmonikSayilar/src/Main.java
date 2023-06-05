import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Please Enter the number :"); int nmr = inp.nextInt();
        double endpoint =0;
        for (double i = 1; i<=nmr; i++)
        {
            double result = (1/i);
            endpoint = endpoint +result;

        }  System.out.println(endpoint);
    }
}