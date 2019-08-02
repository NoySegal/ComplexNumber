public class ComplexNumber {

    int realPart;
    int imaginaryPart;

    public ComplexNumber(int real, int imaginary) {
        realPart = real;
        imaginaryPart = imaginary;
    }

    public ComplexNumber Plus(ComplexNumber other) {
        ComplexNumber result = new ComplexNumber();
        result.realPart = realPart + other.realPart;
        result.imaginaryPart = imaginaryPart + other.imaginaryPart;
        return result;
    }

    public static void main(String[] args) {

    }
}
