package proyecto;

public class PruebasProyecto {
	/**
	 * 
	 * @param args
	 * PRUEBA DE FUNCIONAMIENTO DEL PROYECTO
	 */

	public static void main(String[] args) {
		Proyecto p1=new Proyecto("nombre","apellido1","apellido2","dni",0,"333333333");
		p1.MostrarDatos();
		System.out.println("-----------------------------------------------------");
		ProyectoHerencia p2=new ProyectoHerencia("nombreeeeee","apellido1","apellido2","dni",0,"44444444444","Calle Aprobado n�10","espa�a");
		p2.MostarDatosV();

	}

}
