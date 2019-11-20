package Anuncio;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import Carrinho.CarrinhoController;
import Carrinho.CarrinhoDTO;
import Carrinho.CarrinhoService;

@RequestMapping("/anuncio")
public class AnuncioProdutoService {
			
	private static final AnuncioProdutoDTO[] Anuncio = new AnuncioProdutoDTO[] {
			
	};
	
	private final AnuncioProdutoController anuncioController;
	
	public AnuncioProdutoService(final AnuncioProdutoController anuncioController) {
		this.anuncioController = anuncioController;
		Arrays.asList(AnuncioProdutoService.Anuncio).forEach(dto ->this.anuncioController.insertProduto(dto));
	}

	@GetMapping("/list")
	public java.util.List<AnuncioProdutoDTO> list(){
		return this.anuncioController.getAll;
	}
		
	@GetMapping("/{id}/details") 
	public ResponseEntity<CarrinhoDTO> getCarrinho (@PathVariable final Long id){
		final CarrinhoDTO carrinhoDTO = this.carrinhoController.getCarrinho(id);
		if(carrinhoDTO.equals(CarrinhoDTO.NULL_VALUE)){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<>(carrinhoDTO,HttpStatus.OK);
		}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<CarrinhoDTO> removeCarrinho (@PathVariable final Long id){
		final CarrinhoDTO removedCarrinho = this.carrinhoController.removeCarrinho(id);
		if(removedCarrinho.equals(CarrinhoDTO.NULL_VALUE)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(removedCarrinho, HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<CarrinhoDTO> updateCarrinho(@PathVariable final Long id,@RequestBody final CarrinhoDTO carrinhoDTO){
		final CarrinhoDTO oldCarrinho = this.carrinhoController.updateCarrinho(id, carrinhoDTO);
		if (oldCarrinho.equals(CarrinhoDTO.NULL_VALUE)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
		return new ResponseEntity<>(oldCarrinho, HttpStatus.OK);
	}
	
	@PostMapping
	public Long insertCarinho(@RequestBody final CarrinhoDTO carrinhoDTO) {
		return this.carrinhoController.insertCarrinho(carrinhoDTO);
	}
	
}
