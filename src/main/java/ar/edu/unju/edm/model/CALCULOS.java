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

  public float ResolverPunto1() {
      float Punto1=0;
      if(numero1 == 0) {
    	  return Punto1;
      }else {
    	  if(numero1 == 1) {
        	  Punto1=numero1;
    	  }else {
    		  
    		  for(int i=numero1-1;i==0;i--) {
    			  numero1=numero1*i;
    			  i--;
    		  }   
    	  }
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

  
  public int ResolverPunto3() {
      int Punto3 = 0;
      
     for(int i=0;i>numero1;i++) {
    	
     }
     return Punto3;
  }

}