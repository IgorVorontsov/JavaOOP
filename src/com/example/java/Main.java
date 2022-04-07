package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Getting first vector from the user and calculating its length
        //Would recommend to replace System call by something like log4j/ sl4j logging adapter. 
        // But in general for the learning purpose approach with sout is okay.
        System.out.println("Enter x, y and z (coordinates) of the first vector each one in new line: ");
        double x = scanner.nextFloat();
        double y = scanner.nextFloat();
        double z = scanner.nextFloat();

        Vector vector1 = new Vector(x, y, z);
        System.out.println("Vector length is = " + vector1.length());


        //Getting second vector from the user and calculating dot product
        System.out.println("Enter x, y and z (coordinates) of the second vector each one in new line: ");
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        z = scanner.nextFloat();

        Vector vector2 = new Vector(x, y, z);
        System.out.println("Result of 1st and 2nd vectors multiplication is = " + vector1.multBy(vector2));


        //Generating array of random vectors
        System.out.println("Enter size (number of elements) of the array of random vectors");
        int j = scanner.nextInt();
        Vector[] randVectArray = Vector.randomVectorArray(j); //class Vector is deprecated & not recommended to use.
        for (int i = 0; i < j; i++) {
            //you should never call something like logging in the cycle. Because in the multithreading system - you logging operation
            //could be posponed, and another thread start logging action in the same output stream..
            System.out.println(randVectArray[i]);
        }


        //Calculating dor product with random vector using overridden method
        System.out.println("Result of multiplication of the 1st vector " + vector1 + " with random vector is = " + vector1.multBy());

    }
}
