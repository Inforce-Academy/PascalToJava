import java.util.Scanner;

public class TestDataBuilder_Solution {
    private static final String DOMAIN = "example.com";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username;
        int yearOfBirth;
        String email;
        String[] data = new String[3];

        System.out.print("Username: ");
        username = input.nextLine();

        System.out.print("Year of birth: ");
        yearOfBirth = Integer.parseInt(input.nextLine());

        email = username + "@" + DOMAIN;

        data[0] = username;
        data[1] = email;
        data[2] = Integer.toString(yearOfBirth);

        System.out.println("--- TEST DATA ---");
        System.out.println("username = " + data[0]);
        System.out.println("email    = " + data[1]);
    }
}
