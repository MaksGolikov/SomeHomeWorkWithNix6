import io.Data;
import service.AddService;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data(scanner);
        AddService addService = new AddService();

        int firstNumber = data.input("Enter a: ");
        int secondNumber = data.input("Enter b: ");
        int sum = addService.add(firstNumber, secondNumber);

        data.print("Result: ");
        data.print(sum);
    }
}
