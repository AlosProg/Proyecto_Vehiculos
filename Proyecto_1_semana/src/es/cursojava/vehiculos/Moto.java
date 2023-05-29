package es.cursojava.vehiculos;

/**
 * 
 *Clase hija Moto que heredera de la clase padre Vehiculo
 *
 */
public class Moto extends Vehiculo {
	
	
		/**
		 * 
		 * La matricula sera inmutable, una vez puesto
		 * el numero de ruedas sera automatico cada vez que se cree una moto
		 */
		public Moto(String matricula) {
			super(2, matricula);
			
		}
		
		/**
		 * Metodo para obtener la matricula introducida en el constructor
		 */
		public String getMatricula() {
			return "La matrícula es: "+ super.getMatricula();
		}
		
		
		/**
		 * Metodo para obtener el numero de ruedas de la moto
		 */
		@Override
		public void getNumRuedas() {
			super.getNumRuedas();
		}
		
		/**
		 * Metodo para avanzar con la moto
		 */
		@Override
		public void avanzar(double recorrido, double tiempo) {
			System.out.println("Estamos avanzando con la moto");
			super.avanzar(recorrido, tiempo);
		}
		
		/**
		 * Metodo para arrancar la moto
		 */
		@Override
		public void arrancar() {
			System.out.println("Estamos arrancando la moto");
			super.arrancar();
		}
		
		/**
		 * Metodo para retroceder con la moto
		 */
		@Override
		public void retroceder(double recorrido, double tiempo) {
			System.out.println("Estamos retrocediendo la moto");
			super.retroceder(recorrido, tiempo);
		}
		
		/**
		 * Metodo para parar la moto
		 */
		@Override
		public void parar() {
			System.out.println("Nuestra moto está parada"); 
			super.parar();
		}

}
