package com.example.projetovendas;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/anuncio")
public class AnuncioProdutoService {
			
	private static final AnuncioProduto[] PRODUCTS= new AnuncioProduto[] {
		new AnuncioProduto(1,"caneta",5.00,500,"unidade","Real","transportadora","Azul","Blumenau","Sc","Brasil","888-8888","/algumlugar"),
		new AnuncioProduto(2,"caneta",7.00,500,"unidade","Real","transportadora","Amarela","Blumenau","Sc","Brasil","888-8333","/algumlugar2")
	};
		
	@GetMapping("/list1")
    public AnuncioProduto[] list() {
    	return AnuncioProdutoService.PRODUCTS ;
    }
    
	@GetMapping("/{id}")
	public ResponseEntity<AnuncioProduto> getProdutos(@PathVariable(value = "id") @Valid int id) {
		if(id < 0 || id >= AnuncioProdutoService.PRODUCTS.length){
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		final AnuncioProduto product = AnuncioProdutoService.PRODUCTS[id];
		
		return new ResponseEntity<>(product, HttpStatus.OK);
    }
	
}
