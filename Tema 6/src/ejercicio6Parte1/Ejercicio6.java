package ejercicio6Parte1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		ArrayList<Integer>listaNumeros=new ArrayList<>();
		int numero;
		try(Scanner lectura=new Scanner(new FileReader("src\\ejercicio6Parte1\\Numeros.txt"))) {
			while(lectura.hasNextInt()){
			numero=lectura.nextInt();

			listaNumeros.add(numero);
			}
			listaNumeros.sort(null);
			for(int i=0;i<listaNumeros.size();i++) {
				System.out.println(listaNumeros.get(i));
				}

			


		} catch (FileNotFoundException e) {
			System.out.println("Error");

		} catch (IOException e) {
			System.out.println("Errors");
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ejercicio6Parte1\\Introducir.txt"))){
			for(int i=0;i<listaNumeros.size();i++) {
			bw.write(listaNumeros.get(i).toString());
			bw.write(" ");
			}
			
		} catch (IOException e) {
			System.out.println("Error");

		}
	}

}
