import java.util.Scanner;

public class SimpleInterest_Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Balance;
        double RatePercentage; // interest rate in %
        double Rate; // interest rate - decimal
        double Interest;

        System.out.print("Enter balance: ");
        Balance = Double.parseDouble(input.nextLine());

        System.out.print("Enter rate in %: ");
        RatePercentage = Double.parseDouble(input.nextLine());

        Rate = RatePercentage / 100.0;
        Interest = Balance * Rate;

        System.out.println("Your interest is: " + Interest);
    }
}