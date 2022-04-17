package ar.edu.unju.edm.model;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component

public class CALCULOS {

  private int numero1;
  private int numero2;

  public CALCULOS() {

  }

  public int getNumero1() {
      return numero1;
  }

  public void setNumero1(int numero1) {
      this.numero1 = numero1;
  }

  public int getNumero2() {
      return numero2;
  }

  public void setNumero2(int numero2) {
      this.numero2 = numero2;
  }

  public int ResolverPunto1() {
      int Punto1=1;
      
      for( int i = 1; i <= numero1; i++ ) {
          Punto1 *= i;
       }
  
     return Punto1;
  }
  
  
  public String ResolverPunto2() {
	  
	  Scanner lectura = new Scanner(System.in);
	  System.out.println("Ingrese una fecha por teclado: ");
	  int fecha = lectura.nextInt();

	  System.out.println(fecha);
	  
	  String Punto2 = "null";
      
      if(fecha%4 == 0) {
    	  if(fecha%100 != 0 || fecha%400 == 0) {
    		  return Punto2 = "Es un año Bisiesto";
    	  }else {
    		  Punto2 = "No es un Anio Bisiesto"; 
    	  }
      }else {
    	  Punto2 = "No es un Anio Bisiesto";
      }
     return Punto2;
 }

  
  public String ResolverPunto3() {
      String Punto3 = "null";
      for(int n=5;n==0;n--) {
	      Scanner num = new Scanner(System.in);
		  System.out.println("Ingrese una Numero Entero: ");
		  int punto = num.nextInt();
		  
		  if(punto%2==0) {
			  System.out.println("El Numero " + punto + " ingresado es Par");
		  }else {
			  System.out.println("El Numero " + punto + " ingresado es Impar");
		  }
      }
     return Punto3 = "Operacion Finalizada";
  }

}