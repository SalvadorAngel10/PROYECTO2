package proyecto;
/**
 * 
 * @author salvita
 *CREO UNA HERENCIA SOBRE DONDE VIVEN
 */

public class ProyectoHerencia extends Proyecto {
	protected String Vivienda;
	/**
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param dni
	 * @param edad
	 * @param vivienda
	 * AÑADIMOS VIVIENDA Y CREAMOS LOS CONSTRUCTORES, GETTERS,SSTTERS Y TO STRING
	 */

	public ProyectoHerencia(String nombre, String apellido1, String apellido2, String dni, int edad, String vivienda) {
		super(nombre, apellido1, apellido2, dni, edad);
		Vivienda = vivienda;
	}
	public ProyectoHerencia() {
		super();
		Vivienda ="";
	}
	public ProyectoHerencia(ProyectoHerencia h) {
		super(h.nombre, h.apellido1, h.apellido2, h.dni, h.edad);
		Vivienda = h.Vivienda;
	}
	public String getVivienda() {
		return Vivienda;
	}
	public void setVivienda(String vivienda) {
		Vivienda = vivienda;
	}
	@Override
	public String toString() {
		return "ProyectoHerencia [Vivienda=" + Vivienda + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	public void MostarDatosV() 
	{
		super.MostrarDatos();
		System.out.println("---------------");
		System.out.println("Vivienda: "+this.Vivienda);
	}

	

}
