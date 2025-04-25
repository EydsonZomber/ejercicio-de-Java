import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = obtenerNumero(scanner, "Ingrese el primer número: ");
        double num2 = obtenerNumero(scanner, "Ingrese el segundo número: ");

        System.out.println("\nSeleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = obtenerOpcion(scanner, 1, 4);

        realizarOperacion(num1, num2, opcion);

        scanner.close();
    }

    public static double obtenerNumero(Scanner scanner, String mensaje) {
        double numero;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                break; // Sale del bucle si se ingresa un número válido
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpia el buffer del scanner
            }
        }
        return numero;
    }

    public static int obtenerOpcion(Scanner scanner, int min, int max) {
        int opcion;
        while (true) {
            System.out.print("Ingrese el número de la operación deseada: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= min && opcion <= max) {
                    break; // Sale del bucle si la opción está dentro del rango válido
                } else {
                    System.out.println("Opción inválida. Por favor, ingrese un número entre " + min + " y " + max + ".");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpia el buffer del scanner
            }
        }
        return opcion;
    }

    public static void realizarOperacion(double num1, double num2, int opcion) {
        double resultado;
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción inválida (esto no debería ocurrir).");
        }
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}