package com.example.projetovendas;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoService {
	private static final Produto[] PRODUCTS= new Produto[] {
		new Produto(1,"caneta",5.00,500,"unidade","Real","transportadora","Azul","Blumenau","Sc","Brasil","888-8888","/algumlugar"),
		new Produto(2,"caneta",7.00,500,"unidade","Real","transportadora","Amarela","Blumenau","Sc","Brasil","888-8333","/algumlugar2")
	};
	
	@GetMapping("/list1")
    public Produto[] list() {
    	return ProdutoService.PRODUCTS;
    }
    
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getProdutos(@PathVariable(value = "id") @Valid int id) {
		if(id < 0 || id >= ProdutoService.PRODUCTS.length){
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		final Produto product = ProdutoService.PRODUCTS[id];
		
		return new ResponseEntity<>(product, HttpStatus.OK);
    }
	
}
