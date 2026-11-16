import java.util.Scanner;

public class PersonProfile_Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        int age;
        char gender;
        String fullName;
        String adultText;

        System.out.print("First name: ");
        firstName = input.nextLine();
        System.out.print("Last name: ");
        lastName = input.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Gender (M/F): ");
        gender = input.nextLine().charAt(0);
        fullName = firstName + " " + lastName;

        if (age >= 18) {
            adultText = "adult";
        } else {
            adultText = "minor";
        }

        System.out.println("--- PROFILE ---");
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age + " (" + adultText + ")");
        System.out.println("Gender: " + gender);
    }
}
