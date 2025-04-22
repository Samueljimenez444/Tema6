package ejercicio4Parte1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String texto="";
		Scanner lectura=new Scanner(System.in);
		try(BufferedWriter bw= new BufferedWriter(new FileWriter("src\\ejercicio4Parte1\\Texto.txt"))){
			while(!texto.equals("salir"))
			System.out.println("Introduce el texto para el fichero");
			texto=lectura.nextLine();
			bw.write(texto);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
