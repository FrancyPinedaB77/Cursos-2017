package Paquete;

public class Ejemplos {
	
	public static void main (String[] args){
		// Arreglos bidimensionales VIDEO 10 En Codigo Facilito
		int x[][];
		x= new int[2][2]; // 3 filas y 2 columnas
		
		// se alamacenan 
		x[0][0]= 1;
		x[0][1]= 2;
		x[1][0]= 3;
		x[1][1]= 4;
		
		//Crando un ciclo for para leer los datos de la matriz
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.println("Posicion en la matriz en x["+i+"] ["+j+"] ="+x[i][j]);
			}
		}
	
	}
}
