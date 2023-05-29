package es.cursojava.vehiculos;

import java.util.ArrayList;
import es.cursojava.interfaces.Conducible;

/**
 * 
 * Clase padre que implementa la interfaz Conducible y de la cual heredaran
   las demas clases del vehiculo que se quiera crear: Coche, Moto, etc.
 *
 */

public abstract class Vehiculo implements Conducible {

	
	/**
	 * Cualidades de un vehiculo
	 */
	private String color;
	private int numRuedas;
	private String matricula;
	private double velocidad;
	private double espacioRecorrido;
	private double tiempo;
	ArrayList<Double> listaDeVelocidades;
	
	/**
	 * Constructor con dos caracteristicas propias e inmutables de un vehiculo:
	 * numRuedas y matricula. Ademas se le ira aniadiendo las velocidades obtenidas
	 * en una lista.
	 */
	public Vehiculo(int numRuedas, String matricula) {
		this.numRuedas = numRuedas;
		this.matricula = matricula;
		this.listaDeVelocidades = new ArrayList<>();
	}
	
	/**
	 * 
	 * Metodo para pintar un vehiculo
	 */
	public void pintar(String color) {
		this.color = color;
	}
	
	/**
	 * 
	 * Metodo que devuelve la matricula de un vehiculo
	 */
	
	public String getMatricula() {
		return this.matricula;
	}
	/**
	 * Metodo que para obtener el numero de ruedas de un vehiculo
	 */
	
	public void getNumRuedas() {
		System.out.println("Poniéndole " + this.numRuedas + " ruedas a nuestro vehículo");
	}
	
	/**
	 * Metodo donde se grabara la velocidad de un recorrido (en Kms/h) y se introducira en la lista del constructor
	 */
	public void grabarVelocidad() {
		System.out.println("Grabando la velocidad del recorrido");
		listaDeVelocidades.add(this.velocidad);
	}
	
	/**
	 * Metodo donde se obtienen las velocidades medias (en Kms/h) de cada recorrido
	 */
	public void tacometro() {
		for (int i=0; i < listaDeVelocidades.size();i++) {
			System.out.println("Velocidad media del recorrido " + (i+1) + " = " + listaDeVelocidades.get(i));
		}
	}
	
	
	
	/**
	 * Metodo donde se pone el marcador de espacio y tiempo a 0
	 */
	@Override
	public void arrancar() {
		this.espacioRecorrido = 0;
		this.tiempo = 0;
	}
	
	/**
	 * Metodo donde se ira acumulando el espacio recorrido (en Kms) y el tiempo (en horas) de cada recorrido
	 */
	@Override
	public void avanzar(double recorrido, double tiempo) {
		this.espacioRecorrido += recorrido;
		this.tiempo += tiempo;
	}

	/**
	 * Metodo donde tambien se ira acumulando el tiempo (en horas) y espacio recorrido (en Kms)
	 */
	@Override
	public void retroceder(double recorrido, double tiempo) {
		this.espacioRecorrido += recorrido;
		this.tiempo += tiempo;
	}
	
	/**
	 * Metodo que, una vez parado el vehiculo, calcula la velocidad media obtenida de un recorrido
	 * donde dividiremos el espacio recorrido (en Kms) y el tiempo transcurrido (en horas)
	 */

	@Override
	public void parar() {
		this.velocidad = this.espacioRecorrido / this.tiempo;
	}
	
	
}
