package paquete;
import java.io.*;

public class Textos {
	public void leer(String nombreArchivo){ //Se creo el metodo leer dentro de esa clase 
		try{
			FileReader r= new FileReader(nombreArchivo);//Clase usada para leer archivos de texto
			BufferedReader buffer = new BufferedReader (r);
			
			//System.out.println(buffer.readLine());//lEE la primera linea
			//System.out.println(buffer.readLine()); //Lee la segunda linea
			String temp="";
			
			while(temp!=null){
				temp=buffer.readLine();
				if (temp==null)
					break;
				System.out.println(temp);
			};	
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		};
	};
}
