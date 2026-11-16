import java.util.Locale;
import java.util.Scanner;

public class MiniInvoice_Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] itemName = new String[3];
        int[] qty = new int[3];
        double[] price = new double[3];
        double[] total = new double[3];
        double grandTotal;

        System.out.print("Item 1 name: ");
        itemName[0] = input.nextLine();
        System.out.print("Item 1 quantity: ");
        qty[0] = Integer.parseInt(input.nextLine());
        System.out.print("Item 1 unit price: ");
        price[0] = Double.parseDouble(input.nextLine());

        System.out.print("Item 2 name: ");
        itemName[1] = input.nextLine();
        System.out.print("Item 2 quantity: ");
        qty[1] = Integer.parseInt(input.nextLine());
        System.out.print("Item 2 unit price: ");
        price[1] = Double.parseDouble(input.nextLine());

        System.out.print("Item 3 name: ");
        itemName[2] = input.nextLine();
        System.out.print("Item 3 quantity: ");
        qty[2] = Integer.parseInt(input.nextLine());
        System.out.print("Item 3 unit price: ");
        price[2] = Double.parseDouble(input.nextLine());

        total[0] = qty[0] * price[0];
        total[1] = qty[1] * price[1];
        total[2] = qty[2] * price[2];
        grandTotal = total[0] + total[1] + total[2];

        System.out.println("--- INVOICE ---");
        System.out.printf(Locale.US, "%s: %.2f%n", itemName[0], total[0]);
        System.out.printf(Locale.US, "%s: %.2f%n", itemName[1], total[1]);
        System.out.printf(Locale.US, "%s: %.2f%n", itemName[2], total[2]);
        System.out.printf(Locale.US, "TOTAL: %.2f%n", grandTotal);
    }
}
