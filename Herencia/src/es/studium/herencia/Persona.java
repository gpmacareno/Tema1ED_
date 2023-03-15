package es.studium.herencia;

public class Persona
{
									
	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio;
	private int telefono;

	public Persona()
	{

		nombre = "";
		apellidos = "";
		dni = "";
		domicilio = "";
		telefono = 0;

	}

	public Persona(String nombre, String apellidos, String dni, String domicilio, int telefono)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}

	public int getTelefono()
	{
		return telefono;
	}

	public void setTelefono(int telefono)
	{
		this.telefono = telefono;
	}

}
