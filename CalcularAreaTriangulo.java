import java.util.Scanner;

public class CalcularAreaTriangulo {

    public static void main(String[] args) {
        // Definimos las longitudes de los lados del triángulo
        double ladoA = 5.0;
        double ladoB = 6.0;
        double ladoC = 7.0;

        // Calculamos el semiperímetro (P)
        double perimetro = ladoA + ladoB + ladoC;
        double semiperimetro = perimetro / 2;

        // Calculamos el área utilizando la fórmula de Herón
        double area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));

        // Mostramos el resultado
        System.out.println("El área del triángulo con lados:");
        System.out.println("Lado A = " + ladoA);
        System.out.println("Lado B = " + ladoB);
        System.out.println("Lado C = " + ladoC);
        System.out.println("es: " + area);
    }
}