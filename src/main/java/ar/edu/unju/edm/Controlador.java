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
		int PuntoN1 = 0;
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
	
	@GetMapping("/calculoPunto3")
	public String getPunto3Page(Model model) {
		String PuntoN3 = "null";
		CALCULOS nuevaPunto3 = new CALCULOS();
		//nuevaPunto3.ResolverPunto3();
		PuntoN3 = nuevaPunto3.ResolverPunto3();
		model.addAttribute("Punto3", PuntoN3);
		return "Punto3";
		
	}
	
	@GetMapping("/calculoPunto4")
	public String getPunto4Page(Model model) {
		String PuntoN4 = "null";
		CALCULOS nuevaPunto4 = new CALCULOS();
		//nuevaPunto4.ResolverPunto4();
		PuntoN4 = nuevaPunto4.ResolverPunto4();
		model.addAttribute("Punto4", PuntoN4);
		return "Punto4";
	}
	
	@GetMapping("/calculoPunto5")
	public String getPunto5Page(Model model) {
		String PuntoN5 = "null";
		CALCULOS nuevaPunto5 = new CALCULOS();
		//nuevaPunto5.ResolverPunto5();
		PuntoN5 = nuevaPunto5.ResolverPunto5();
		model.addAttribute("Punto5", PuntoN5);
		return "Punto5";
	}
	
}
