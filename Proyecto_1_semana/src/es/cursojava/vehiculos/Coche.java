package es.cursojava.vehiculos;

/**
  * Clase hija Coche que heredera de la clase padre Vehiculo
 */
public class Coche extends Vehiculo{

	/**
	 * Constructor donde la matricula sera inmutable y una vez puesto
	 * el numero de ruedas sera automatico cada vez que se cree el coche
	 */

	public Coche(String matricula) {
		super(4, matricula);
		
	}
	
	/**
	 * Metodo para obtener la matricula introducida en el constructor
	 */
	public String getMatricula() {
		return "La matrícula es: "+ super.getMatricula();
	}
	
	
	/**
	 * Metodo para obtener el numero de ruedas del coche
	 */
	@Override
	public void getNumRuedas() {
		super.getNumRuedas();
	}
	
	/**
	 * Metodo para avanzar con el coche
	 */
	@Override
	public void avanzar(double recorrido, double tiempo) {
		System.out.println("Estamos avanzando con el coche");
		super.avanzar(recorrido, tiempo);
	}
	
	/**
	 * Metodo para arrancar el coche
	 */
	@Override
	public void arrancar() {
		System.out.println("Estamos arrancando el coche");
		super.arrancar();
	}
	
	/**
	 * Metodo para retroceder con el coche
	 */
	@Override
	public void retroceder(double recorrido, double tiempo) {
		System.out.println("Estamos retrocediendo el coche");
		super.retroceder(recorrido, tiempo);
	}
	
	/**
	 * Metodo para parar el coche
	 */
	@Override
	public void parar() {
		System.out.println("Nuestro coche está parado"); 
		super.parar();
	}
}
