package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holamundo{
	public String saludo() {
	return"<h1>Hola mundo</h1>"; 
	}
	@RequestMapping("/persona")
	public List<persona>getPersonas(){
		List <persona>personas=new ArrayList<persona>();
		
		persona p1=new persona();
		p1.setId(1);
		p1.setNombre("Brenda");
		p1.setApellido("Diaz");
		p1.setTelefono("992112221");
		
		
		persona p2=new persona();
		p2.setId(2);
		p2.setNombre("Cruz");
		p2.setApellido("Zuñiga");
		p2.setTelefono("9912148");
		
		personas.add(p1);
		personas.add(p2);
		return personas;
	}

}
