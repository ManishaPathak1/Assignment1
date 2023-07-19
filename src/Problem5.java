import java.io.IOException;
import java.util.Scanner;

public class Problem5 {
    Problem5() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your rollnumber: ");
            int roll = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your field of interest: ");
            String field = scanner.nextLine();
            System.out.println("Hey, my name is " + name + " and my roll number is " + roll + ". My field of interest are " + field + ".");

        } catch (Exception e) {
            System.out.println("Oops Error!!!");
        }

    }
}
