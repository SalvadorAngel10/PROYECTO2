package proyecto;

public class ProyectoHerencia extends Proyecto {
	protected String Vivienda;

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
	
	

}
