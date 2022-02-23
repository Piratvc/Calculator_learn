package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2); // a=3
        int b = calc.minus.apply(1, 1); // b=0
        int c = calc.devide.apply(a, b);   // b=0 на ноль делить нельзя
        boolean e = calc.isPositive.test(-5);
        int d = calc.multiply.apply(1, 50);
        System.out.println(e);
        calc.println.accept(c);
        calc.println.accept(d);
    }
}
