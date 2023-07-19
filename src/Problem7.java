import java.util.Scanner;

public class Problem7 {
    Problem7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks obtained: ");
        float marks = scanner.nextFloat();
        if (marks < 25) {
            System.out.println("Failed!!!");
        } else if (marks > 25 && marks <= 45) {
            System.out.println("Grade E");
        } else if (marks > 45 && marks <= 50) {
            System.out.println("Grade D");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("Grade C");
        } else if (marks > 60 && marks <= 80) {
            System.out.println("Grade B");
        } else if (marks > 80) {
            System.out.println("Grade A");
        } else {
            System.out.println("Enter your marks");
        }
    }
}
