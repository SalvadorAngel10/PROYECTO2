package proyecto;

public class Proyecto {
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String dni;
	protected int edad;
	//constructores
	public Proyecto(String nombre, String apellido1, String apellido2, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.edad = edad;
	}
	public Proyecto() {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.edad = edad;
	}
	public Proyecto(Proyecto p) {
		super();
		this.nombre = p.nombre;
		this.apellido1 = p.apellido1;
		this.apellido2 = p.apellido2;
		this.dni = p.dni;
		this.edad =p.edad;
	}
	



}
