package service.impl;

import service.Service;

public class AddServiceImpl implements Service {

    @Override
    public int calculateTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }
}
