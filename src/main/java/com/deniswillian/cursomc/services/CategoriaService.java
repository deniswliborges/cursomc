package com.deniswillian.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deniswillian.cursomc.domain.Categoria;
import com.deniswillian.cursomc.repositories.CategoriaRepository;
import com.deniswillian.cursomc.services.exceptions.ObjectNotFounfException;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo; // declarando dependencia da Class repositorio
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFounfException(
				"Objeto não encontrado! Id: "+ id + ", Tipo: "+ Categoria.class.getName()));
	}
}
