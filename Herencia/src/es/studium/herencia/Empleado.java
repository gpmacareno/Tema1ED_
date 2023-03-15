package es.studium.herencia;

public class Empleado extends Persona // Con extends heredas de la clase a la que seleccionas.
{

	private String puesto;

	public Empleado()
	{
		super(); // Con super () introduces en esta linea todos los constructores vacios de la
					// clase padre.
		puesto = "";
	}

	public Empleado(String nombre, String apellidos, String dni, String domicilio, int telefono, String puesto) // constructor con parametros, lleva todos los del padre  + el suyo propio.
	{
		super(nombre, apellidos, dni, domicilio, telefono); // Metodo constructor del padre.
		this.puesto = puesto;

	}

	public String getPuesto()
	{
		return puesto;
	}

	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}

}
