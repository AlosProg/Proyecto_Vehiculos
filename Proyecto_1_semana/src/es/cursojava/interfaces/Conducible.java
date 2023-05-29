package es.cursojava.interfaces;

/**
 * 
 * Se crea la interfaz Conducible, siendo las caracteristicaa comunes de todos
 * los vehiculos conducibles el porder arrancar, avanzar, retroceder o parar.
 */
public interface Conducible {
	
	/**
	 * Metodo a implementar por un vehiculo concreto, donde pondra el espacio y el tiempo a 0
	 */
	public void arrancar();
	
	/**
	 * Metodo a implementar por un vehiculo concreto, donde se ira acumulando el espacio recorrido en Kms y el tiempo en horas
	 */
	public void avanzar(double recorrido, double tiempo);
	
	/**
	 * Metodo a implementar por un vehiculo concreto, donde se ira acumulando el espacio recorrido en Kms y el tiempo en horas
	 */
	public void retroceder(double recorrido, double tiempo);
	
	/**
	 * Metodo donde se para el coche y calcula la valocidad media en kms/h de un recorrido diviendo el espacio recorrido entre el tiempo transcurrido
	 */
	public void parar();

}
