package es.cursojava.directora;

import es.cursojava.vehiculos.Coche;
import es.cursojava.vehiculos.Moto;
import es.cursojava.vehiculos.Vehiculo;

/**
 * Clase principal donde se probara la aplicacion
 */
public class Principal {

	/**
	 * 
	 * Metodo Main de la aplicacion
	 */
	public static void main(String[] args) {
		
			/**
			 * Se crea un objeto coche
			 */
			System.out.println("*********CREANDO UN COCHE*************");
		
				Vehiculo miCoche = new Coche("4567");
				miCoche.getNumRuedas();
				miCoche.pintar("VERDE");
				System.out.println(miCoche.getMatricula());
				
				System.out.println("***RECORRIDO 1***");
				
				/**
				 * A continuacion se prueba a hacer dos recorridos con el coche creado
				 * Primer recorrido
				 */
				miCoche.arrancar();
				miCoche.avanzar(400,3);
				miCoche.retroceder(100, 1);
				miCoche.parar();
				miCoche.grabarVelocidad();
				
				System.out.println("***RECORRIDO 2***");
				
				/**
				 * Segundo recorrido
				 */
				miCoche.arrancar();
				miCoche.avanzar(39, 5);
				miCoche.parar();
				miCoche.grabarVelocidad();
				
				System.out.println("***VELOCIDADES OBTENIDAS***");
				
				
				/**
				 * Obtenemos los resultados de los dos recorridos
				 */
				miCoche.tacometro();
			
			System.out.println("*********CREANDO UNA MOTO*************");
			
			/**
			 * Se crea un objeto moto
			 */
				Vehiculo miMoto = new Moto("6789");
				miMoto.getNumRuedas();
				miMoto.pintar("AZUL");
				System.out.println(miMoto.getMatricula());
				
				System.out.println("***RECORRIDO 1***");
				/**
				 * A continuacion se prueba a hacer tres recorridos con la moto creada
				 * Primer recorrido
				 */
				miMoto.arrancar();
				miMoto.avanzar(200,4);
				miMoto.parar();
				miMoto.grabarVelocidad();
				
				System.out.println("***RECORRIDO 2***");
				
				/**
				 * Segundo recorrido
				 */
				miMoto.arrancar();
				miMoto.avanzar(80, 7);
				miMoto.parar();
				miMoto.grabarVelocidad();
				
				System.out.println("***RECORRIDO 3***");
				
				/**
				 * Tercer recorrido
				 */
				miMoto.arrancar();
				miMoto.avanzar(120, 3);
				miMoto.parar();
				miMoto.grabarVelocidad();
				
				System.out.println("***VELOCIDADES OBTENIDAS***");
				
				/**
				 * Obtenemos los resultados de los tres recorridos
				 */
				miMoto.tacometro();
	}
}
