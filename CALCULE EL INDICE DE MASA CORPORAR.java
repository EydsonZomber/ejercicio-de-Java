import java.util.Scanner;

public class CalculadorIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = obtenerPeso(scanner);
        double altura = obtenerAltura(scanner);

        if (peso > 0 && altura > 0) {
            double imc = calcularIMC(peso, altura);
            mostrarResultado(imc);
        } else {
            System.out.println("Por favor, ingrese valores válidos para el peso y la altura.");
        }

        scanner.close();
    }

    public static double obtenerPeso(Scanner scanner) {
        double peso;
        while (true) {
            System.out.print("Ingrese su peso en kilogramos (kg): ");
            if (scanner.hasNextDouble()) {
                peso = scanner.nextDouble();
                if (peso > 0) {
                    break; // Sale del bucle si el peso es válido
                } else {
                    System.out.println("El peso debe ser un valor positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpia el buffer del scanner
            }
        }
        return peso;
    }

    public static double obtenerAltura(Scanner scanner) {
        double altura;
        while (true) {
            System.out.print("Ingrese su altura en metros (m): ");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                if (altura > 0) {
                    break; // Sale del bucle si la altura es válida
                } else {
                    System.out.println("La altura debe ser un valor positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpia el buffer del scanner
            }
        }
        return altura;
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void mostrarResultado(double imc) {
        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Usted está en bajo peso.");
        } else if (imc < 25) {
            System.out.println("Usted tiene un peso normal.");
        } else if (imc < 30) {
            System.out.println("Usted tiene sobrepeso.");
        } else {
            System.out.println("Usted tiene obesidad.");
        }
    }
}