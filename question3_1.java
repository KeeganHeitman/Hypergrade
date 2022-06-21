import java.util.Scanner;
public class question3_1
{
    public static void main(String[] args)
    {
        System.out.println("== One Year Interest Calculator ==");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much money do you have?");
        double P = keyboard.nextDouble();
        
        System.out.println("What's the interest rate?");
        double R = keyboard.nextDouble();
        
        double Interest_Rate=R/100;
        
        double T = 1.00;
        
        double SI = (P*R*T)/100;
        
        double new_balance = SI + P;
        
        double interest_gained = Interest_Rate * P;
        
        System.out.println("Interest earned: $" + interest_gained);
        System.out.println("New balance: $" + new_balance);
    }
}