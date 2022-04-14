package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Punto1Calculadora;

//import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tpn01QuinterosMarcosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tpn01QuinterosMarcosApplication.class, args);
	}

	Punto1Calculadora unPunto1Calculadora = new Punto1Calculadora(); // Metodo Construccion
    unPunto1Calculadora.setNumero1(10);
    System.out.println("El resultado del Factorial es: " + unPunto1Calculadora.ResolverPunto1());
    
}
