package proyecto;
/**
 * 
 * @author salvita
 *CREACION INICIAL DEL PROYECTO
 */

public class Proyecto {
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String dni;
	protected int edad;
	
	/**
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param dni
	 * @param edad
	 * AÑADIMOS LOS CONSTRUCTORES
	 */
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
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.dni = "";
		this.edad = 0;
	}
	public Proyecto(Proyecto p) {
		super();
		this.nombre = p.nombre;
		this.apellido1 = p.apellido1;
		this.apellido2 = p.apellido2;
		this.dni = p.dni;
		this.edad =p.edad;
	}
	
	/**
	 * 
	 * @return
	 * AÑADIMOS LOS GETTERS Y SETTERS
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * CREAMOS EL TO STRING
	 */
	@Override
	public String toString() {
		return "Proyecto [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", edad=" + edad + "]";
	}
	/**
	 * CREAMOS UN METODO PERSONALIZADO
	 */
	public void MostrarDatos() 
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Primer apellido: "+this.apellido1);
		System.out.println("Segundo apellido: "+this.apellido2);
		System.out.println("DNI: "+this.dni);
		System.out.println("Edad: "+this.edad);

	}
	
	



}
