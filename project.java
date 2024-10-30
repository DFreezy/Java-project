import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // Ask for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");

        // Ask for height
        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();
        System.out.println("You are " + height + " cm tall");

        scanner.close();
    }
}
