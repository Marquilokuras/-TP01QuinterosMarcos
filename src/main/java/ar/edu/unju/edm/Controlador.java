package ar.edu.unju.edm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.CALCULOS;

@Controller
public class Controlador {

	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		
		return "index";
	}
	
	@GetMapping("/calculoPunto1")
	public String getPunto1Page(@RequestParam (name = "num1") int num1, Model model) {
		float PuntoN1 = 0;
		CALCULOS nuevaPunto1 = new CALCULOS();
		nuevaPunto1.setNumero1(num1);
		nuevaPunto1.ResolverPunto1();
		PuntoN1 = nuevaPunto1.ResolverPunto1();
		model.addAttribute("Punto1", PuntoN1);
		return "Punto1";
	}
	
	@GetMapping("/calculoPunto2")
	public String getPunto2Page(Model model) {
		String PuntoN2 = "null";
		CALCULOS nuevaPunto2 = new CALCULOS();
		nuevaPunto2.ResolverPunto1();
		PuntoN2 = nuevaPunto2.ResolverPunto2();
		model.addAttribute("Punto2", PuntoN2);
		return "Punto2";
	}
	
}
