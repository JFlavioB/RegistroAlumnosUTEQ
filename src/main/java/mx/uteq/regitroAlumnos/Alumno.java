package mx.uteq.regitroAlumnos;

public class Alumno {
	
	private String matricula;
	private String nombre;
	private String edad;
	private String carrera;
	
	public Alumno() {
		
	}
	public Alumno(String matricula, String nombre, String edad, String carrera) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	

}
