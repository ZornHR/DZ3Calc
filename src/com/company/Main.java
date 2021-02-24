package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число А = ");
        double a = input.nextInt();
        System.out.println("Введите число В = ");
        double b = input.nextInt();
        System.out.println("Введите оператор (+-*/)");
        String operator = input.next();
        System.out.println(a + operator + b);

        if (operator.equals("+")) {
            Plus plus = new Plus();
            double res = plus.execute(a, b);
            System.out.println(res);
        }
        if (operator.equals("-")) {
            Minus minus = new Minus();
            double res = minus.execute(a, b);
            System.out.println(res);
        }
        if (operator.equals("/")) {
            Div div = new Div();
            double res = div.execute(a, b);
            System.out.println(res);
        }
        if (operator.equals("*")) {
            Mult mult = new Mult();
            double res = mult.execute(a, b);
            System.out.println(res);
        }
    }
}
