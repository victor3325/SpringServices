package com.example.projetovendas;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

interface AnuncioProdutoRepository extends CrudRepository<AnuncioProdutoEntity, Id> {
	
}
