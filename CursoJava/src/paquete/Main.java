package paquete;
import  paquete.Carro;
public  class Main {
	
	public static void main (String[] args){
		// Programación orientada a objentos Ejemplo String texto ="este es el texto"
		
		CarroToyota c;
		c = new CarroToyota();
		c.apagar();
		c.encender();
		System.out.println(c.modelo());
	}
}
