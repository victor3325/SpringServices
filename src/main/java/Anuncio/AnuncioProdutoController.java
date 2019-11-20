package Anuncio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;


@Controller
public class AnuncioProdutoController {
	
	private final AnuncioProdutoRepository anuncioRepository;

	AnuncioProdutoController(final AnuncioProdutoRepository anuncioRepository) {
		this.anuncioRepository = anuncioRepository;
	}

	private static void updateEntityFromDTO(final AnuncioProdutoDTO anuncioDTO, final AnuncioProdutoEntity anuncioEntity) {
		anuncioEntity.setId(anuncioDTO.getId());
		anuncioEntity.setNome(anuncioDTO.getNome());
		anuncioEntity.setPreco_unit(anuncioDTO.getPreco_unit());
		anuncioEntity.setcategoria(anuncioDTO.getcategoria());
		anuncioEntity.setQuantidade(anuncioDTO.getQuantidade());
		anuncioEntity.setMoeda(anuncioDTO.getMoeda());
		anuncioEntity.setPais(anuncioDTO.getPais());
		anuncioEntity.setEstado(anuncioDTO.getEstado());
		anuncioEntity.setCidade(anuncioDTO.getCidade());
		anuncioEntity.setDescricao(anuncioDTO.getDescricao());
		anuncioEntity.setEntrega(anuncioDTO.getEntrega());
		anuncioEntity.setImagem_produto(anuncioDTO.getImagem_produto());
	
	}

	private static AnuncioProdutoEntity toEntity(final AnuncioProdutoDTO anuncioDTO) {
		final long id = anuncioDTO.getId();
		final String nome = anuncioDTO.getNome();
	    final double preco_unit = anuncioDTO.getPreco_unit();
	    final int quantidade = anuncioDTO.getQuantidade();
	    final String categoria = anuncioDTO.getcategoria();
	    final String moeda = anuncioDTO.getMoeda();
	    final String entrega = anuncioDTO.getEntrega();
	    final String descricao = anuncioDTO.getDescricao();
	    final String cidade = anuncioDTO.getCidade();
	    final String estado = anuncioDTO.getEstado();
	    final String pais = anuncioDTO.getPais();
	    final String cep = anuncioDTO.getCep();
	    final String imagem_produto = anuncioDTO.getImagem_produto();
		return new AnuncioProdutoEntity(id, nome, preco_unit, quantidade, categoria, moeda, entrega, descricao, cidade, estado, pais, cep, imagem_produto)
	}

	private static AnuncioProdutoDTO toDTO(final AnuncioProdutoEntity anuncioEntity) {
		final long id = anuncioEntity.getId();
		final String nome = anuncioEntity.getNome();
	    final double preco_unit = anuncioEntity.getPreco_unit();
	    final int quantidade = anuncioEntity.getQuantidade();
	    final String categoria = anuncioEntity.getcategoria();
	    final String moeda = anuncioEntity.getMoeda();
	    final String entrega = anuncioEntity.getEntrega();
	    final String descricao = anuncioEntity.getDescricao();
	    final String cidade = anuncioEntity.getCidade();
	    final String estado = anuncioEntity.getEstado();
	    final String pais = anuncioEntity.getPais();
	    final String cep = anuncioEntity.getCep();
	    final String imagem_produto = anuncioEntity.getImagem_produto();
		return new AnuncioProdutoDTO(id, nome, preco_unit, quantidade, categoria, moeda, entrega, descricao, cidade, estado, pais, cep, imagem_produto)
	}

	private boolean isNotExistsProductByIdentifier(final Long id) {
		// TODO Auto-generated method stub
		return !this.anuncioRepository.existsById(id);
	}

	List<AnuncioProdutoDTO> getAllProduto() {
		final List<AnuncioProdutoDTO> carrinhoDTO = new ArrayList<>();
		this.anuncioRepository.findAll().forEach(anuncioEntity -> carrinhoDTO.add(AnuncioProdutoController.toDTO(anuncioEntity)));
		return carrinhoDTO;
	}

	AnuncioProdutoDTO getProduto(final Long id) {
		final Optional<AnuncioProdutoEntity> optionalProduto = this.anuncioRepository.findById(id);
		if (optionalProduto.isPresent()) {
			return AnuncioProdutoController.toDTO(optionalProduto.get());
		}
		return AnuncioProdutoDTO.NULL_VALUE;
	}

	AnuncioProdutoDTO removeProdutoDTO(final Long id) {
		final Optional<AnuncioProdutoEntity> optionalProduto = this.anuncioRepository.findById(id);
		if (optionalProduto.isPresent()) {
			final AnuncioProdutoEntity anuncioEntity = optionalProduto.get();
			this.anuncioRepository.delete(anuncioEntity);
			return AnuncioProdutoController.toDTO(anuncioEntity);
		}
		return AnuncioProdutoDTO.NULL_VALUE;
	}

	Long insertProduto(final AnuncioProdutoDTO anuncioDTO) {
		final AnuncioProdutoEntity carrinhoEntity = AnuncioProdutoController.toEntity(anuncioDTO);
		this.anuncioRepository.save(carrinhoEntity);
		return carrinhoEntity.getId();
	}

	AnuncioProdutoDTO updateProduto(final Long id, final AnuncioProdutoDTO anuncioDTO) {
		final Optional<AnuncioProdutoEntity> optionalProduto = this.anuncioRepository.findById(id);
		if (optionalProduto.isPresent()) {
			final AnuncioProdutoEntity anuncioEntity = optionalProduto.get();
			final CarrinhoDTO oldCarrinho = CarrinhoController.toDTO(carrinhoEntity);
			CarrinhoController.updateEntityFromDTO(carrinhoDTO, carrinhoEntity);
			this.carrinhoRepository.save(carrinhoEntity);
			return oldCarrinho;
		}
		return CarrinhoDTO.NULL_VALUE;
		
	}

}
