package com.example.projetovendas;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrinho")

public class CarrinhoService {

	private static final Carrinho [] Carr = new Carrinho[] {
			new Carrinho(1, 300.00, 47, 347),
			new Carrinho(2, 100, 25, 125),
			new Carrinho(3, 938, 26, 964)
	};

	@GetMapping("/list")
	public Carrinho[] list() {
		return CarrinhoService.Carr; 
	}
		
	@GetMapping("/{id}") 
	public ResponseEntity<Carrinho> getCarrinho (@PathVariable(value = "id") @Valid int id){
		if(id < 0 || id >= CarrinhoService.Carr.length){
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			final Carrinho carrinh = CarrinhoService.Carr[id];
			return new ResponseEntity<>(carrinh,HttpStatus.OK);
		}
	}
