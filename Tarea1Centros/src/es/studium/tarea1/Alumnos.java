package es.studium.tarea1;

	public class Alumnos {

		private String nombre;
		private String direccion;
		private int numeromatricula;
		private float notaasignatura;
		private Centros centro;
		private Asignaturas asignatura;

		public Alumnos() {

			nombre = "";
			direccion = "";
			numeromatricula = 0;
			notaasignatura = 0.0f;
			centro = new Centros();
			asignatura = new Asignaturas();

		}

		public Alumnos(String nombre, String direccion, int numeromatricula, float notaasignatura, Centros centro,
				Asignaturas asignatura)
		{
			this.nombre = nombre;
			this.direccion = direccion;
			this.numeromatricula = numeromatricula;
			this.notaasignatura = notaasignatura;
			this.centro = centro;
			this.asignatura = asignatura;
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

		public int getNumeromatricula()
		{
			return numeromatricula;
		}

		public void setNumeromatricula(int numeromatricula)
		{
			this.numeromatricula = numeromatricula;
		}

		public float getNotaasignatura()
		{
			return notaasignatura;
		}

		public void setNotaasignatura(float notaasignatura)
		{
			this.notaasignatura = notaasignatura;
		}

		public Centros getCentro()
		{
			return centro;
		}

		public void setCentro(Centros centro)
		{
			this.centro = centro;
		}

		public Asignaturas getAsignatura()
		{
			return asignatura;
		}

		public void setAsignatura(Asignaturas asignatura)
		{
			this.asignatura = asignatura;
		}

		
	}


