package es.studium.tarea1;

public class TestAcademiaDeIdiomas
{

	public static void main(String[] args)
	{
		Centros centro1 = new Centros("Escuela de Inglés", "Reyes Católicos, 14", 14110);
		Centros centro2 = new Centros("Escuela de Francés", "Cristóbal Colón, 92", 11796);

		System.out
				.println("La dirección del centro" + " " + centro1.getNombre() + " " + "es " + centro1.getDireccion());
		System.out
				.println("La dirección del centro" + " " + centro2.getNombre() + " " + "es " + centro2.getDireccion());

		Asignaturas asignatura1 = new Asignaturas("Ingles B1", 360, "159753P");
		Asignaturas asignatura2 = new Asignaturas("Ingles B2", 400, "8521547K");
		Asignaturas asignatura3 = new Asignaturas("Frances A2", 350, "753951M");
		Asignaturas asignatura4 = new Asignaturas("Francés B1", 300, "654123V");
		Asignaturas asignatura5 = new Asignaturas("Francés B2", 420, "985261B");

		Alumnos alumno1 = new Alumnos("Ana Abel", "Paseo de América, 15", 120, 7.0f, centro1, asignatura1);
		Alumnos alumno2 = new Alumnos("Benito Bueno", "Reyes Católicos, 16", 100, 6.0f, centro1, asignatura2);
		Alumnos alumno3 = new Alumnos("Carmen Cano", "Reyes Católicos, 2", 110, 5.0f, centro1, asignatura1);
		Alumnos alumno4 = new Alumnos("Esteban Escalera", "Isabel la Católica, 28", 90, 9.0f, centro2, asignatura4);
		Alumnos alumno5 = new Alumnos("Francisco Farfán	", "Cristóbal Colón, s/n", 75, 8.5f, centro2, asignatura3);
		Alumnos alumno6 = new Alumnos("Gerardo Macareno", "Ciudad de Gandia, nº2", 80, 10.0f, centro2, asignatura5);

		System.out.println("\nLa alumna " + alumno3.getNombre() + " está matriculada en el centro "
				+ alumno3.getCentro().getNombre() + ".");

		System.out.println("\nLa nota que ha sacado " + alumno2.getNombre() + " en "
				+ alumno2.getAsignatura().getNombre() + " es un " + alumno2.getNotaasignatura());
	}

}
