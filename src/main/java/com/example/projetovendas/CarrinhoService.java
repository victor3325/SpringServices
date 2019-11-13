package com.example.projetovendas;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	private final CarrinhoController carrinhoController;
	
	public CarrinhoService(final CarrinhoController carinhoController) {
		this.carrinhoController = carinhoController;
		Arrays.asList(CarrinhoService.Carr).forEach(dto ->this.carrinhoController.insertCarrinho(dto));
	}

	@GetMapping("/list")
	public java.util.List<Carrinho> list(){
		return this.carrinhoController.getAllCarrinho();
	}
		
	@GetMapping("/{id}/details") 
	public ResponseEntity<Carrinho> getCarrinho (@PathVariable final Long id){
		final Carrinho carrinho = this.carrinhoController.getCarrinho(id);
		if(carrinho.equals(Carrinho.NULL_VALUE)){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<>(carrinho,HttpStatus.OK);
		}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Carrinho> removeCarrinho (@PathVariable final Long id){
		final Carrinho removedCarrinho = this.carrinhoController.removeCarrinho(id);
		if(removedCarrinho.equals(Carrinho.NULL_VALUE)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(removedCarrinho, HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Carrinho> updateCarrinho(@PathVariable final Long id,@RequestBody final Carrinho carrinho){
		final Carrinho oldCarrinho = this.carrinhoController.updateCarrinho(id, carrinho);
		if (oldCarrinho.equals(Carrinho.NULL_VALUE)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
		return new ResponseEntity<>(oldCarrinho, HttpStatus.OK);
	}
	
	@PostMapping
	public Long insertCarinho(@RequestBody final Carrinho carrinho) {
		return this.carrinhoController.insertCarrinho(carrinho);
	}
}

