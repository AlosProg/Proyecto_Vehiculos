# Proyecto_Vehiculos
Con el siguiente proyecto se crean vehículos y se calculan las velocidades medias de cada recorrido hecho por el vehículo concreto creado


![imagen](https://github.com/AlosProg/Proyecto_Vehiculos/assets/125483177/a1a29972-e198-402b-a45a-d6961b449fee)

## **Indice**

#### **Vehiculos (paquete)**
##### - Vehiculo (clase)
##### - Coche (clase)
##### - Moto (clase)
#### **Intefaces (paquete)**
##### - Conducible (interfaz)
#### **Directora (paquete)**
##### - Principal (clase Main)

## **Estado del proyecto**

:octocat:Terminado :octocat:

## **Demostración de funciones y aplicaciones en la clase principal**

package es.cursojava.directora;

import es.cursojava.vehiculos.Coche;
import es.cursojava.vehiculos.Moto;
import es.cursojava.vehiculos.Vehiculo;


public class Principal {

	public static void main(String[] args) {
		
				Vehiculo miCoche = new Coche("4567");
				miCoche.getNumRuedas();
				miCoche.pintar("VERDE");
				System.out.println(miCoche.getMatricula());
				
				System.out.println("***RECORRIDO 1***");
				
				miCoche.arrancar();
				miCoche.avanzar(400,3);
				miCoche.retroceder(100, 1);
				miCoche.parar();
				miCoche.grabarVelocidad();
				
				System.out.println("***RECORRIDO 2***");
				
				miCoche.arrancar();
				miCoche.avanzar(39, 5);
				miCoche.parar();
				miCoche.grabarVelocidad();
				
				System.out.println("***VELOCIDADES OBTENIDAS***");
				
				
				miCoche.tacometro();
			
				Vehiculo miMoto = new Moto("6789");
				miMoto.getNumRuedas();
				miMoto.pintar("AZUL");
				System.out.println(miMoto.getMatricula());
				
				miMoto.arrancar();
				miMoto.avanzar(200,4);
				miMoto.parar();
				miMoto.grabarVelocidad();
				
				miMoto.arrancar();
				miMoto.avanzar(80, 7);
				miMoto.parar();
				miMoto.grabarVelocidad();
				
				miMoto.arrancar();
				miMoto.avanzar(120, 3);
				miMoto.parar();
				miMoto.grabarVelocidad();
				
				miMoto.tacometro();
	}
}

Se crean dos instancias de vehículo, un Coche y una Moto, se introducen varios recorridos de cada vehículo y se obtienen las siguientes velocidades de cada uno:

*********CREANDO UN COCHE*************
Poniéndole 4 ruedas a nuestro vehículo
La matrícula es: 4567
***RECORRIDO 1***
Estamos arrancando el coche
Estamos avanzando con el coche
Estamos retrocediendo el coche
Nuestro coche está parado
Grabando la velocidad del recorrido
***RECORRIDO 2***
Estamos arrancando el coche
Estamos avanzando con el coche
Nuestro coche está parado
Grabando la velocidad del recorrido
***VELOCIDADES OBTENIDAS***
Velocidad media del recorrido 1 = 125.0
Velocidad media del recorrido 2 = 7.8
*********CREANDO UNA MOTO*************
Poniéndole 2 ruedas a nuestro vehículo
La matrícula es: 6789
***RECORRIDO 1***
Estamos arrancando la moto
Estamos avanzando con la moto
Nuestra moto está parada
Grabando la velocidad del recorrido
***RECORRIDO 2***
Estamos arrancando la moto
Estamos avanzando con la moto
Nuestra moto está parada
Grabando la velocidad del recorrido
***RECORRIDO 3***
Estamos arrancando la moto
Estamos avanzando con la moto
Nuestra moto está parada
Grabando la velocidad del recorrido
***VELOCIDADES OBTENIDAS***
Velocidad media del recorrido 1 = 50.0
Velocidad media del recorrido 2 = 11.428571428571429
Velocidad media del recorrido 3 = 40.0



