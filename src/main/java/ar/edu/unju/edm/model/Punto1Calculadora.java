package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Punto1Calculadora {

  private float numero1;

  public Punto1Calculadora() {

  }

  public float getNumero1() {
      return numero1;
  }

  public void setNumero1(float numero1) {
      this.numero1 = numero1;
  }

  public float ResolverPunto1() {
      float Punto1=0;
      if(numero1 == 0) {
    	  return Punto1;
      }else {
    	  if(numero1 == 1) {
        	  Punto1=numero1;
    	  }else {
    		  
    		  for(float i=numero1-1;i==0;i--) {
    			  numero1=numero1*i;
    			  i--;
    		  }   
    	  }
      }
     return Punto1;
  }


}
