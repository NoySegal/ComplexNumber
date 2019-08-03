# ComplexNumber
Complex numbers class implementation

### Prerequisites
Compiles with Java 8.

### How to use:
* Compile >> javac ComplexNumber.java
* Execute >> java ComplexNumber


### Example:

#### Sample usage:
```java
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
```

#### yields:
```
4.0 + 6.0i
2.0 + -2.0i
-5.0 + 14.0i
0.6470588235294118 + -0.5882352941176471i
5.0
2.0
5.385164807134504
0.3805063771123649
false
5.0055023857573895 + 1.9992613301359765i
```