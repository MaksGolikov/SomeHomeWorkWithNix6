import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter b: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.print("Result: ");
        System.out.println(sum);
    }
}
