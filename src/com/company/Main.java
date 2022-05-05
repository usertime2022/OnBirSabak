package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	Triangle triangle = new Triangle();
    triangle.a = scanner.nextDouble();
    triangle.b = scanner.nextDouble();
    triangle.c = 2;
        triangle.area();
    }
}
