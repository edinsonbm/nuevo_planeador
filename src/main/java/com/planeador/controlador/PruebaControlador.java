package com.planeador.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaControlador {

//	Idealmente, vamos a quitar o modificar este controlador de aquí en el futuro.
//	De momento, sólo va a servir para que la página no se buguee si uno entra
//	a "/"
	@GetMapping("/")
	public String probar() {
		return "test_file";
	}
}
