package paquete;

public class Pelota {
	float peso;
	float radio;
	public Pelota()
	{
		radio=100;
		peso=250;
	}
	public float obtenerPeso() // tipo float 
	{
		return peso;
	}
	public Pelota(float radio, float peso)
	{
		this.radio=radio;
		this.peso=peso;
	}
	public void patearPelota() // tipo void 
	{
		System.out.println("Haz pateado la pelota como objeto");
	}
}
