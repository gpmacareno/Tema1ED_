package es.studium.herencia;

public class Principal
{

	public static void main(String[] args)
	{

		Consejero consejero1 = new Consejero("Esteban", "Alquitran Manchado", "20556997Ñ", "Calle Hueca nº1000",
				666888777, "Barrendero", 60);
		System.out.println("El empleado" + " " + consejero1.getNombre() + " " + consejero1.getApellidos()
				+ ", su DNI es" + " " + consejero1.getDni() + " " + ", reside en, " + consejero1.getDomicilio()
				+ ", con numero de telefono:" + " " + consejero1.getTelefono() + ", su actual puesto en la empresa es"
				+ " " + consejero1.getPuesto() + " " + "y posee un total de acciones de "
				+ consejero1.getNumero_acciones());

		Consejero consejero2 = new Consejero();
		consejero2.setNombre("Javier");
		consejero2.setApellidos("Malavida Yun");
		consejero2.setDni("369521478J");
		consejero2.setDomicilio("Calle debajo del puente, nº5");
		consejero2.setTelefono(666222111);
		consejero2.setPuesto("Cantante");
		consejero2.setNumero_acciones(10);

		System.out.println("\n" + "El empleado" + " " + consejero2.getNombre() + " " + consejero2.getApellidos()
				+ ", su DNI es" + " " + consejero2.getDni() + ", reside en," + " " + consejero2.getDomicilio()
				+ ", con numero de telefono:" + " " + consejero2.getTelefono() + ", su actual puesto en la empresa es"
				+ " " + consejero2.getPuesto() + " " + "y posee un total de acciones de "
				+ consejero2.getNumero_acciones());

		consejero1.setNumero_acciones(consejero1.getNumero_acciones() - 50);
		consejero2.setNumero_acciones(consejero2.getNumero_acciones() + 100);

		System.out.println("\n" + "El numero de acciones de" + " " + consejero1.getNombre() + " "
				+ " ha cambiado debido a una venta de ultima hora " + consejero1.getNumero_acciones()
				+ " acciones. ");
		System.out.println("\n" + "El numero de acciones de" + " " + consejero2.getNombre() + " "
				+ " ha cambiado debido a una compra de ultima hora " + consejero2.getNumero_acciones()
				+ " acciones. ");

	}

}
