package proyecto;
/**
 * 
 * @author salvita
 *CREO UNA HERENCIA SOBRE DONDE VIVEN
 */

public class ProyectoHerencia extends Proyecto {
	protected String Vivienda;
	/**
	 * AÑADO EL ATRIBUTO PAIS
	 */
	protected String pais;
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

	public ProyectoHerencia(String nombre, String apellido1, String apellido2, String dni, int edad,String telefono, String Vivienda,String pais) {
		super(nombre, apellido1, apellido2, dni, edad,telefono);
		this.Vivienda= Vivienda;
		this.pais=pais;
	}
	public ProyectoHerencia() {
		super();
		this.Vivienda="";
		this.pais="";
	}
	public ProyectoHerencia(ProyectoHerencia h) {
		super(h.nombre, h.apellido1, h.apellido2, h.dni, h.edad,h.telefono);
		this.Vivienda=h.Vivienda;
		this.pais=h.pais;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getVivienda() {
		return Vivienda;
	}
	public void setVivienda(String vivienda) {
		Vivienda = vivienda;
	}
	
	
	@Override
	public String toString() {
		return "ProyectoHerencia [Vivienda=" + Vivienda + ", pais=" + pais + ", nombre=" + nombre + ", apellido1="
				+ apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", edad=" + edad + ", telefono=" + telefono
				+ "]";
	}
	public void MostarDatosV() 
	{
		super.MostrarDatos();
		System.out.println("---------------");
		System.out.println("Vivienda: "+this.Vivienda);
		System.out.println("Pais: "+this.pais);
	}

	

}
