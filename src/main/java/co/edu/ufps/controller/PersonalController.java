package co.edu.ufps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ufps.entities.Funcion;
import co.edu.ufps.entities.Personal;
import co.edu.ufps.entities.Personal;
import co.edu.ufps.repositories.PersonalRepository;
import co.edu.ufps.services.PersonalService;

@RestController
@RequestMapping("/personals")
public class PersonalController {
	
	@Autowired
	public PersonalService personalService;
	
	@GetMapping()
	public List<Personal> list() {
		return personalService.list();
	}
	
	@PostMapping()
	public Personal create(@RequestBody Personal personal) {
		
		Personal nuevaPersonal = personalService.create(personal);
		return nuevaPersonal;
	}
	
	@PutMapping("/{id}")
	public Personal update(@PathVariable Integer id, @RequestBody Personal personal) {
		return personalService.update(id, personal);
	}
	
	@GetMapping("/{id}")
	public Personal get(@PathVariable Integer id) {
		return personalService.get(id);
	}
	
	@DeleteMapping("/{id}")
	public Personal delete(@PathVariable Integer id) {
		return personalService.delete(id);
	}

}
