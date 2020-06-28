package io.impl;

import io.Data;

import java.util.Scanner;

public class DataImpl implements Data  {
    private Scanner scanner;

    public DataImpl(Scanner sc){
        this.scanner = sc;
    }

    @Override
    public void print (String text){
        System.out.print(text);
    }
    @Override
    public void print (int number){
        System.out.println(number);
    }
    @Override
    public int read (){
        return scanner.nextInt();
    }
    @Override
    public int input(String text){
        print(text);
        return read();
    }
}
