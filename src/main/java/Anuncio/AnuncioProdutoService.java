package Anuncio;

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
@RequestMapping("/anuncio")
public class AnuncioProdutoService {
			
	private static final AnuncioProdutoDTO[] Anuncio = new AnuncioProdutoDTO[] {
			new AnuncioProdutoDTO(1, "teclado azulado", 2.5, 10, "Periféricos", "Real", "fedex", "Top do top do top", "sabe", "voce", "slá", "Ahh", "nao é putaria"),
			new AnuncioProdutoDTO(2, "teclado amarelado", 2.5, 10, "Periféricos", "Real", "fedex", "Top do top do top", "sabe", "voce", "slá", "Ahh", "nao é putaria"),
			new AnuncioProdutoDTO(3, "mouse azulado", 2.5, 10, "Periféricos", "Real", "fedex", "Top do top do top", "sabe", "voce", "slá", "Ahh", "nao é putaria")
	};
	
	private final AnuncioProdutoController anuncioController;
	
	public AnuncioProdutoService(final AnuncioProdutoController anuncioController) {
		this.anuncioController = anuncioController;
		Arrays.asList(AnuncioProdutoService.Anuncio).forEach(dto ->this.anuncioController.insertProduto(dto));
	}

	@GetMapping("/list")
	public java.util.List<AnuncioProdutoDTO> list(){
		return this.anuncioController.getAllProduto();
	}
		
	@GetMapping("/{id}/details") 
	public ResponseEntity<AnuncioProdutoDTO> getProduto (@PathVariable final Long id){
		final AnuncioProdutoDTO anuncioDTO = this.anuncioController.getProduto(id);
		if(anuncioDTO.equals(AnuncioProdutoDTO.NULL_VALUE)){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<>(anuncioDTO,HttpStatus.OK);
		}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<AnuncioProdutoDTO> removeProduto (@PathVariable final Long id){
		final AnuncioProdutoDTO removedProduto = this.anuncioController.removeProdutoDTO(id);
		if(removedProduto.equals(AnuncioProdutoDTO.NULL_VALUE)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(removedProduto, HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<AnuncioProdutoDTO> updatePoduto(@PathVariable final Long id,@RequestBody final AnuncioProdutoDTO anuncioDTO){
		final AnuncioProdutoDTO oldProduto = this.anuncioController.updateProduto(id, anuncioDTO);
		if (oldProduto.equals(AnuncioProdutoDTO.NULL_VALUE)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
		return new ResponseEntity<>(oldProduto, HttpStatus.OK);
	}
	
	@PostMapping
	public Long insertProduto(@RequestBody final AnuncioProdutoDTO anuncioDTO) {
		return this.anuncioController.insertProduto(anuncioDTO);
	}
	
}
