import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gender (Male/Female): ");
        String gender = scanner.next();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.next();

        System.out.println("\nThe information you entered:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phoneNumber);

        System.out.println("\nHello " + name + "! Thank you for using the program.");
    }
}