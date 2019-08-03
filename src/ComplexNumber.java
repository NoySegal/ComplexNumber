/**
 * Compilation: javac ComplexNumber.java
 * Execution: java ComplexNumber

 * Immutable Complex numbers data type
 */

import java.lang.Math;

public class ComplexNumber {

    private double re;
    private double im;
    private static final double EPSILON = 0.001;

    // create a new object with the given real and imaginary parts
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.re = realPart;
        this.im = imaginaryPart;
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }

    // return a new ComplexNumber object whose value is (this + other)
    public ComplexNumber plus(ComplexNumber other) {
        double newRe = this.re + other.re;
        double newIm = this.im + other.im;
        return new ComplexNumber(newRe, newIm);
    }

    // return a new ComplexNumber object whose value is (this - other)
    public ComplexNumber minus(ComplexNumber other) {
        double newRe = this.re - other.re;
        double newIm = this.im - other.im;
        return new ComplexNumber(newRe, newIm);
    }

    // return a new ComplexNumber object whose value is (this * other)
    public ComplexNumber times(ComplexNumber other) {
        double newRe = this.re * other.re - this.im * other.im;
        double newIm = this.re * other.im + this.im * other.re;
        return new ComplexNumber(newRe, newIm);
    }

    // return a new ComplexNumber object whose value is (this / other)
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.re * other.re + other.im * other.im;
        double newRe = (this.re * other.re + this.im * other.im) / denominator;
        double newIm = (this.im * other.re - this.re * other.im) / denominator;
        return new ComplexNumber(newRe, newIm);
    }

    // get cartesian real part
    public double getRealPart() {
        return this.re;
    }

    // get cartesian imaginary part
    public double getImaginaryPart() {
        return this.im;
    }

    // get polar radius
    public double getRadius() {
        return Math.sqrt(this.re * this.re + this.im * this.im);
    }

    // get polar argument
    public double getArgument() {
        return Math.atan2(this.im, this.re);
    }

    // compares the radius difference of this and other to a predefined scale
    public boolean almostEquals(ComplexNumber other) {
        double difference = Math.abs(this.getRadius() - other.getRadius());
        return difference < EPSILON;
    }

    // return a new ComplexNumber object derived from (radius, argument) pair
    public static ComplexNumber fromPolarCoordinates(double radius, double argument) {
        double newRe = radius * Math.cos(argument);
        double newIm = radius * Math.sin(argument);
        return new ComplexNumber(newRe, newIm);
    }

    // sample functionality testing
    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(3, 2);
        ComplexNumber complex2 = new ComplexNumber(1, 4);
        ComplexNumber complex3 = new ComplexNumber(5, 2);
        System.out.println(complex1.plus(complex2));
        System.out.println(complex1.minus(complex2));
        System.out.println(complex1.times(complex2));
        System.out.println(complex1.divide(complex2));
        System.out.println(complex3.getRealPart());
        System.out.println(complex3.getImaginaryPart());
        System.out.println(complex3.getRadius());
        System.out.println(complex3.getArgument());
        System.out.println(complex1.almostEquals(complex2));
        System.out.println(complex3.fromPolarCoordinates(5.39, 0.38));
    }
}
