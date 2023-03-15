package es.studium.tarea1;

public class Asignaturas
{
	private String nombre;
	private int horas;
	private String codigoid;

	public Asignaturas()
	{

		nombre = "";
		horas = 0;
		codigoid = "";

	}

	public Asignaturas(String name, int hour, String id)
	{

		nombre = name;
		horas = hour;
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

	public int getHoras()
	{
		return horas;
	}

	public void setHoras(int horas)
	{
		this.horas = horas;
	}

	public String getCodigoid()
	{
		return codigoid;
	}

	public void setCodigoid(String codigoid)
	{
		this.codigoid = codigoid;
	}

}
