public class ComplexNumber {

    private double re;
    private double im;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.re = realPart;
        this.im = imaginaryPart;
    }

    public ComplexNumber plus(ComplexNumber other) {
        double newRe = this.re + other.re;
        double newIm = this.im + other.im;
        ComplexNumber result = new ComplexNumber(newRe, newIm);
        return result;
    }

    public ComplexNumber minus(ComplexNumber other) {
        double newRe = this.re - other.re;
        double newIm = this.im - other.im;
        ComplexNumber result = new ComplexNumber(newRe, newIm);
        return result;
    }

    public ComplexNumber times(ComplexNumber other) {
        double newRe = this.re * other.re - this.im * other.im;
        double newIm = this.re * other.im + this.im * other.re;
        ComplexNumber result = new ComplexNumber(newRe, newIm);
        return result;
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.re * other.re + other.im * other.im;
        double newRe = (this.re * other.re + this.im * other.im) / denominator;
        double newIm = (this.im * other.re - this.re * other.im) / denominator;
        ComplexNumber result = new ComplexNumber(newRe, newIm);
        return result;
    }

    public static void main(String[] args) {

    }
}
