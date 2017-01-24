package paquete;
import java.io.*;
public class Main {
	/*
	 * 
	 * 
	 * 
	 */
	public static void main (String[] args){
		// Variables de texto en java
		String texto ="";
		double x=0;
		
		
		InputStreamReader in = new InputStreamReader(System.in);//Abriendo un canal de datos que recibe  datos desde el exterior
		BufferedReader buffer = new BufferedReader(in);//Almacena los datos que recje desde el exterior
		
		try{
			texto = buffer.readLine();//Lee el dato del teclado
			x = Double.parseDouble(texto);//pasando un texto a enterio
		}catch(IOException e){
			System.out.println("se debe ingresa un numero");	
		};
		System.out.println(x+5);
		
	}
}
