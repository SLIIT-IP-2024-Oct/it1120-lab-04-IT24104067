import java.util.Scanner;

public class IT24104067Lab4Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.print("The number is Positive.");
        } else if (number < 0) {
            System.out.print("The number is Negative.");
        } 
        else {
            System.out.print("The number is Zero.");
        }
        scanner.close();
        
    }
}