package com.kata.Bobrov.calculator;

import java.util.Scanner;

public class MainCalc {

    public static void main(String[] args) {
        System.out.println("Калькулятор принимает на вход строку в формате \"a + b\"." +
                "\nРимские и арабские числа от 1 до 10 включительно." +
                "\nПоддерживаемые операции: +, -, *, /." +
                "\nВведите строку для калькулятора: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculator(scanner.nextLine()));
    }

    public static String calculator(String input) {
        return Calculator.result(input);
    }
}