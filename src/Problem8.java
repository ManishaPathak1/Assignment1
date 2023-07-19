import java.util.Scanner;

public class Problem8 {
    Problem8() {

        int g = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Value: ");
        int X = scanner.nextInt();
        System.out.println("Enetr second Value: ");
        int Y = scanner.nextInt();
        for (int i = 1; i <= X; i++) {
            if (X % i == 0 && Y % i == 0)
                g = i;
        }
        System.out.println(g);
    }
}
