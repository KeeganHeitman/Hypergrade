import java.util.Scanner;

public class hypergrade2_2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        double number = keyboard.nextInt();
        double answer = number + 1;
        System.out.println(number + " + 1 = " + answer);
    }
}