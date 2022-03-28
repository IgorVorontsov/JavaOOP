package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x, y and z");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();

        Vector vector1 = new Vector(x, y, z);

        System.out.println("Vector lenth is = " + vector1.lenth());

        System.out.println("Enter x, y and z");
         x = scanner.nextFloat();
         y = scanner.nextFloat();
         z = scanner.nextFloat();

        Vector vector2 = new Vector(x, y, z);

        System.out.println("Result of mult is = " + vector1.multBy(vector2));


        int j = scanner.nextInt();
        Vector.randomVectorArray(j);

        System.out.println("Result of mult is = " + vector1.multBy());


    }
}
