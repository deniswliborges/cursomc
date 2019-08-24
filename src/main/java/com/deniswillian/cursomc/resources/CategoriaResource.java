package com.deniswillian.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deniswillian.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")//EndPoint que irá buscar dados http . ex: http://localhost:8081/categorias
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)// Get para obter Dados | .POST para salvar Dados ou Criar novo recurso .DELETE para deletar
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1,"Informática");
		Categoria cat2 = new Categoria(2,"Esccritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		
		return lista;
	}
}
