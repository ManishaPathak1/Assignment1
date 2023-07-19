import java.util.Scanner;

public class Problem6 {
    Problem6(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total cost of the item: ");
        long totalCost=scanner.nextLong();
        if (totalCost>=1000){
           double X=totalCost-(totalCost*0.01);
            System.out.println("The final price after discount is: Rs."+X);

        }else {
            System.out.println("Discount is not applicable for less than 1000 value: ");
        }
    }
}
