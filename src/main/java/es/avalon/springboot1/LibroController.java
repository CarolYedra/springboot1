package es.avalon.springboot1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.avalon.jpa.negocio.Libro;

@Controller 
@RequestMapping("/libros")
public class LibroController {
	
	@RequestMapping("/1")
	public Libro BuscarLibro() {
		return new Libro("java", "yo", 800);
	}
	@RequestMapping("/lista")
	public String BuscarLibro(Model modelo)  {
		
		List <Libro> lista=new ArrayList<Libro>();
		lista.add(new Libro("java", "yo", 800));
		lista.add(new Libro("java2", "yo", 800));
		lista.add(new Libro("java3", "yo", 800));
		modelo.addAttribute("lista",lista);
		return "listalibros";
	}
	
	
}
