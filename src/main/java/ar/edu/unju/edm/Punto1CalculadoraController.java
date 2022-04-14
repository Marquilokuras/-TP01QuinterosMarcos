package ar.edu.unju.edm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto1Calculadora;

@Controller
public class Punto1CalculadoraController {

	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		
		return "index";
	}
	
	@GetMapping("/calculoPunto1")
	public String getP1Page(@RequestParam (name = "num1") float num1, Model model) {
		float PuntoN1 = 0;
		Punto1Calculadora nuevaPunto1Calculadora = new Punto1Calculadora();
		nuevaPunto1Calculadora.setNumero1(num1);
		nuevaPunto1Calculadora.ResolverPunto1();
		PuntoN1 = nuevaPunto1Calculadora.ResolverPunto1();
		model.addAttribute("Punto1", PuntoN1);
		return "Punto1";
	}
	
}
