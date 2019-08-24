package com.deniswillian.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")//EndPoint que irá buscar dados http . ex: http://localhost:8081/categorias
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)// Get para obter Dados | .POST para salvar Dados ou Criar novo recurso .DELETE para deletar
	public String listar() {
		return " REST esta Funcionando!";
	}
}
