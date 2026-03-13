import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("2026");
        int age = 21;
        System.out.print("Age: " + age);
        double networth = 1000000.50;
        System.out.println("Net Worth: " + networth + " dollars");
        char grade = 'A';
        System.out.println("Grade: " + grade);

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        scanner.close();
    }
}