package es.studium.tarea1;

public class Centros
{
	private String nombre;
	private String direccion;
	private int codigoid;

	public Centros()
	{

		nombre = "";
		direccion = "";
		codigoid = 0;

	}

	public Centros(String name, String address, int id)
	{

		nombre = name;
		direccion = address;
		codigoid = id;

	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	public int getCodigoid()
	{
		return codigoid;
	}

	public void setCodigoid(int codigoid)
	{
		this.codigoid = codigoid;
	}

}
