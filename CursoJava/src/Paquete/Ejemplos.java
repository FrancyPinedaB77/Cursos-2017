package Paquete;

public class Ejemplos {
	
public static void main (String[] args){
//Intrucciones break y continue
	for(int i=0;i<=10; i++)
		{
		System.out.println("Estas dentro del ciclo for");
			if (i==5)
				{
					break; //Sale del ciclo
				}
		System.out.println("El valor de i es :" +i);
		}
	System.out.println("Has salido del ciclo for ");
}
}
