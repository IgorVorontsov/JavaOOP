package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x, y and z (coordinates) of the first vector each one in new line: ");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();

        Vector vector1 = new Vector(x, y, z);

        System.out.println("Vector length is = " + vector1.length());

        System.out.println("Enter x, y and z (coordinates) of the second vector each one in new line: ");
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        z = scanner.nextFloat();

        Vector vector2 = new Vector(x, y, z);

        System.out.println("Result of 1st and 2nd vectors multiplication is = " + vector1.multBy(vector2));

        System.out.println("Enter size (number of elements) of the array of random vectors");

        int j = scanner.nextInt();
        Vector[] randVectArray = Vector.randomVectorArray(j);
        for (int i = 0; i < j; i++) {
            System.out.println(randVectArray[i]);
        }


        System.out.println("Result of multiplication of the 1st vector " + vector1 + " with random vector is = " + vector1.multBy());


    }
}
