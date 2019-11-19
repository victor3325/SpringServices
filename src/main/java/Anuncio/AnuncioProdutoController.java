package Anuncio;

import org.springframework.stereotype.Controller;

@Controller
public class AnuncioProdutoController {
	
	private final AnuncioProdutoRepository produtoRep;
	
	AnuncioProdutoController(AnuncioProdutoRepository produtoRep){
		this.produtoRep = produtoRep;
	}

}
