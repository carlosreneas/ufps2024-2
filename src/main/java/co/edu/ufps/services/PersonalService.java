package co.edu.ufps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.entities.Funcion;
import co.edu.ufps.entities.Personal;
import co.edu.ufps.repositories.PersonalRepository;

@Service
public class PersonalService {
	
	@Autowired
	public PersonalRepository personalRepository;

	public List<Personal> list() {
		return personalRepository.findAll();
	}
	
	public Personal create(Personal personal) {
		// TODO Auto-generated method stub
		return personalRepository.save(personal);
	}
	
}
