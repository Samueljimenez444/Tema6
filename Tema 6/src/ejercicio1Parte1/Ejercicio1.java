package ejercicio1Parte1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        String ruta = "src\\ejercicio1Parte1\\NumerosReales.txt";
        double suma = 0;
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = br.readLine();
            if (linea != null) {
                String[] numeros = linea.split(" ");
                for (String numStr : numeros) {
                    double numero = Double.parseDouble(numStr);
                    suma += numero;
                    contador++;
                }
            }

            if (contador > 0) {
                double media = suma / contador;
                System.out.println("Suma: " + suma);
                System.out.println("Media: " + media);
            } else {
                System.out.println("No se encontraron números en el archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error de formato en el archivo: " + e.getMessage());
        }
    }
}
