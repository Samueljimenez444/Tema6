package ejercicio4Parte1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {
		try(BufferedWriter bw= new BufferedWriter(new FileWriter("src\\ejercicio4Parte1\\Texto.txt"))){
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
