package com.deniswillian.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deniswillian.cursomc.domain.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
