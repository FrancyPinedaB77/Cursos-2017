package paquete;

public class Carro {
	double peso;
	double altura;
	int numero_puertas;
	String  modelo;
	boolean encendido=false;
	// ESTE ES UN CONSTRUCTOR EN JAVA
	public Carro() 
	{
		this.peso=234;
		this.altura=1.50;
		this.numero_puertas=4;
		this.modelo= "Renault";
	}
	//ESTE ES UN M�TODO EN JAVA con diferente tipos dependiendo  lo que retorne el metodo
	public double obtenerPeso()
	{
		return this.peso;
	}
	public String modelo()
	{
		return this.modelo;
	}
	public void encender()
	{
		this.encendido= true;
		System.out.println("El carro esta encendido");
	}
	public void apagar()
	{
		this.encendido=false;
		System.out.println("El carro esta apagado");
	}
	public void estado()
	{
		if (this.encendido==true)
			System.out.println("El carro esta encendido");
		else
			System.out.println("El carro esta apagado");
	}
	public void informacion()
	{
		System.out.println("este es un carro corriente");
	}
}
class CarroBMW extends Carro // lo que se hace es un nuevo tipo de objeto dentrode  carro hijo de carro
{
	public CarroBMW()
	{
		this.modelo="BMW";
		
	}
	public void turbo()
	{
		System.out.println("Acabas de viajar a 100 millas por segundo");
	}
	public void informacion()
	{
		System.out.println("este es un carro BMW elegante");
	}
}

class CarroToyota extends Carro
{
	public CarroToyota(){
		this.modelo="Toyota";
	}
	public void informacion()
	{
		System.out.println("este es un carro Toyota 2016");
	}

}

