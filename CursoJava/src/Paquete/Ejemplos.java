package Paquete;

public class Ejemplos {
	
public static void main (String[] args){
	int x=1;
	boolean cond=true;
	while(cond==true)
	{
		System.out.println("el valoor de X es de: " +x);
		x=x+2; 
		if (x>8)
			{
			cond = false;	
			}
	}
}
}
