package controller;

import io.Data;
import service.Service;

public class Controller {
    private int firstNumber;
    private int secondNumber;
    private int sum;

    public  void initialization(Data data){
        firstNumber =  data.input("Enter firstNumber: ");
        secondNumber =  data.input("Enter secondNumber: ");
    }

    public void calculate(Service service){
        sum = service.calculateTwoNumbers(firstNumber,secondNumber);
    }

    public void done(Data data){
        data.print("Result: ");
        data.print(sum);
    }
}
