package com.example.java;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Method to calculate length of the vector

    public double length() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    //Method that calculates the dot product

    public double multBy(Vector B) {
        return this.x * B.x + this.y * B.y + this.z * B.z;
    }

    @Override
    public String toString() {
        return "Vector {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    //Method that creates single random vector

    public static Vector randomVector() {

        return new Vector(Math.random(), Math.random(), Math.random());

    }


    //Static method that creates an array of random vectors
    public static Vector[] randomVectorArray(int j) {

        Vector[] vector = new Vector[j];
        for (int i = 0; i < j; i++) {
            vector[i] = Vector.randomVector();
        }
        return vector;

    }

    //Overloaded multiplication method to use random vector
    public double multBy() {
        Vector B = Vector.randomVector();
        return this.x * B.x + this.y * B.y + this.z * B.z;
    }


}
