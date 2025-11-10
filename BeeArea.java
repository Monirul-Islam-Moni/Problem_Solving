import java.io.IOException;
import java.util.Scanner;

/**
 * BeeArea - Calculates areas of different geometric shapes based on user input.
 * Solves Beecrowd problem 1012 (Areas).
 */
public class BeeArea {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // Read input values
        double sideA = SCANNER.nextDouble();
        double sideB = SCANNER.nextDouble();
        double sideC = SCANNER.nextDouble();

        // Calculation object
        Calculation calculator = new Calculation();

        // Print results formatted to 3 decimal places
        System.out.printf("TRIANGULO: %.3f%n", calculator.calculateRightTriangleArea(sideA, sideC));
        System.out.printf("CIRCULO: %.3f%n", calculator.calculateCircleArea(sideC));
        System.out.printf("TRAPEZIO: %.3f%n", calculator.calculateTrapeziumArea(sideA, sideB, sideC));
        System.out.printf("QUADRADO: %.3f%n", calculator.calculateSquareArea(sideB));
        System.out.printf("RETANGULO: %.3f%n", calculator.calculateRectangleArea(sideA, sideB));
    }
}

/**
 * Calculation - Provides methods to calculate areas of different geometric shapes.
 */
class Calculation {
    private static final double PI = 3.14159;

    /**
     * Calculates area of a right-angled triangle.
     *
     * @param base base of the triangle
     * @param height height of the triangle
     * @return area
     */
    double calculateRightTriangleArea(double base, double height) {
        return (base * height) / 2.0;
    }

    /**
     * Calculates area of a circle.
     *
     * @param radius radius of the circle
     * @return area
     */
    double calculateCircleArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    /**
     * Calculates area of a trapezium.
     *
     * @param base1 first base
     * @param base2 second base
     * @param height height
     * @return area
     */
    double calculateTrapeziumArea(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2.0;
    }

    /**
     * Calculates area of a square.
     *
     * @param side side length
     * @return area
     */
    double calculateSquareArea(double side) {
        return Math.pow(side, 2);
    }

    /**
     * Calculates area of a rectangle.
     *
     * @param length length
     * @param width width
     * @return area
     */
    double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
