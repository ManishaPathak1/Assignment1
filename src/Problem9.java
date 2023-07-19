import java.util.Scanner;

public class Problem9 {
    Problem9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        if (number < 0 && number == 0) {
            System.out.println("factorial is not defined for value smaller than or equals to zero");
        } else {
            for (int i = 1; i <= number; i++)
                factorial = factorial * i;
        }
        System.out.println("Factorial of a number is: "+factorial);

    }
}



