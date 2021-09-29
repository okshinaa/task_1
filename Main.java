package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double a = readTriangleSide("A");
        double b = readTriangleSide("B");
        double c = readTriangleSide("C");

        boolean flag = doesTriangleExists(a,b,c);
        if(!flag) {
            System.out.println("Треугольник не существует");
            System.exit(0);
        }

        double[] heights = calculateTriangleHeights(a, b, c);

        printTriangleHeights(heights);
    }

    private static double readTriangleSide(String sideName) {
        System.out.println("Введите сторону треуголька " + sideName);
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();

        if (side <= 0) {
            System.out.println("Данные не корректны, введенное значение меньше 0");
            System.exit(0);
        }

        return side;
    }

    private static boolean doesTriangleExists(double a, double b, double c){
        return (a < (b + c) && b < (a + c) && c < (a + b));
    }

    private static double[] calculateTriangleHeights(double a, double b, double c) {
        double[] heights = new double[3];

        double p = (a + b + c) / 2;
        double k = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        double ha = 2 / a * k;
        double hb = 2 / b * k;
        double hc = 2 / c * k;

        heights[0] = ha;
        heights[1] = hb;
        heights[2] = hc;

        return heights;
    }

    private static void printTriangleHeights(double[] heights){
        System.out.printf("Высоты треугольника равны: %1$.3f, %2$.3f, %3$.3f", heights[0], heights[1], heights[2]);
    }
}