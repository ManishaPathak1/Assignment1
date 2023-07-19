import java.util.Scanner;

public class Student {
    Student(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name=scanner.nextLine();
        if(name.isBlank()){
            System.out.println("\"Unknown\"");
        }else {
            System.out.println("The name of the student is: "+name);
        }


    }
}
