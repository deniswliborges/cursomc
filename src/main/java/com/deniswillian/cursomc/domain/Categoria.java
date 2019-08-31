package com.deniswillian.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Categoria implements Serializable{
	//6-Serialização
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//1-Atributos
	private Integer id;
	private String nome;
	
	@JsonManagedReference // Para Trazer objetos instanciados
	@ManyToMany(mappedBy="categorias")
	//2-ASSOCIAÇÃO = Olhar no Banco de Dados se é de UM para Muitos, de Muitos para UM
	//Ex.: Uma Categoria tem varios Produtos, então temos que criar uma associação
	//do Produto dentro da class Categoria, ou seja, criar uma lista de Produtos na Class que será
	//associada.
	          //<class>    objeto       \\Array List java.util
	private List<Produto> produtos = new ArrayList<>();
	
	//3-Criando construtor
	public Categoria() {
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//4-Criando Get e Set(encapsulamento)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	//5-@ HashCode e Equals (Implementação padrão: somente id) = Comparar os Objetos por conteúdo
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

		
}
