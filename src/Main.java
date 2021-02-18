import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercise-1
        // Java bean is a design pattern that extend the POGO pattern.
        // It uses a strict set of rules around how to implement it.

        // Exercise-2
        // Design patterns are not language dependent.

        // Exercise-3
        Scanner scanner = new Scanner(System.in);
        Logs custumerLog = Logs.getInstance();
        System.out.print("Input your name: ");
        String input = scanner.next();
        custumerLog.writeToFile(input);

        System.out.print("Input your age: ");
        input = scanner.next();
        custumerLog.writeToFile(input);

        System.out.print("Input your address: ");
        input = scanner.next();
        custumerLog.writeToFile(input);

        System.out.print("Input your phone number: ");
        input = scanner.next();
        custumerLog.writeToFile(input);
    }
}
