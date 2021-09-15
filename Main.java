package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Введите стороны треуголька:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        calculanyions(a, b, c);

    }

    public static void calculanyions(double a, double b, double c) {

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            double p = (a + b + c) / 2;
            double k = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            double ha = 2 / a * k;
            double hb = 2 / b * k;
            double hc = 2 / c * k;
            System.out.printf("Высоты треугольника равны:%1$.3f, %2$.3f, %3$.3f", ha, hb, hc);
        } else {
            System.out.println("Неравенство треугольника не выполняется");
        }
    }
}