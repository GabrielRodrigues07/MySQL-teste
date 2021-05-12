package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Unidade;
import com.example.demo.repositories.UnidadeRepository;
import com.exampleteste.trabalhoteste.services.exceptions.ClientNotFoundException;

@Service
public class UnidadeService {

	
	@Autowired
	private UnidadeRepository repository;
	
	public List<Unidade> findAll() {
		return repository.findAll();
	}
	
	public Unidade findById(Long id) {
		Optional<Unidade> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ClientNotFoundException(id));
	}
	
	public Unidade inserir(Unidade obj) {
        return repository.save(obj);
    }
}
