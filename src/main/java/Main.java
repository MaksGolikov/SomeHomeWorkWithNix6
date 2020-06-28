import io.Data;
import io.impl.DataImpl;
import service.Service;
import service.impl.AddServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new DataImpl(scanner);
        Service addService = new AddServiceImpl();

        int firstNumber = data.input("Enter a: ");
        int secondNumber = data.input("Enter b: ");
        int sum = addService.calculateTwoNumbers(firstNumber, secondNumber);

        data.print("Result: ");
        data.print(sum);
    }
}
