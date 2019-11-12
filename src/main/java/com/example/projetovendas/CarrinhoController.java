package com.example.projetovendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

public class CarrinhoController {

@Controller
final class ProductController {

	private final CarrinhoRepository carrinhoRepository;

	ProductController(final CarrinhoRepository carrinhoRepository) {
		this.carrinhoRepository = carrinhoRepository;
	}

	private static void updateEntityFromDTO(final Carrinho carrinho, final CarrinhoEntity carrinhoEntity) {
		carrinhoEntity.setId(carrinho.getId());
		carrinhoEntity.setValor_unitario(carrinho.getValor_unitario());
		carrinhoEntity.setValor_frete(carrinho.getvalor_Frete());
		carrinhoEntity.setTotal_pedido(carrinho.getTotal_pedido());
		
		
	}
/*
	private static CarrinhoEntity toEntity(final Carrinho carrinho) {
	
		return new carrinhoEntity();
	}

	private static carrinho toDTO(final CarrinhoEntity carrinhoEntity) {

		return new carrinho();
	}

	private boolean isNotExistsProductByIdentifier(final Long id) {
		// TODO Auto-generated method stub
		return !this.CarrinhoRepository.existsById(id);
	}

	List<carrinho> getAllProducts() {
		final List<carrinho> products = new ArrayList<>();
		this.CarrinhoRepository.findAll().forEach(carrinhoEntity -> products.add(ProductController.toDTO(carrinhoEntity)));
		/*
		 * final Iterable<carrinhoEntity> entities = this.CarrinhoRepository.findAll();
		 * for (final carrinhoEntity carrinhoEntity : entities) {
		 * products.add(ProductController.toDTO(carrinhoEntity)); }
		 */
		/*
		 * for (final Iterator<carrinhoEntity> iterator = entities.iterator();
		 * iterator.hasNext();) { final carrinhoEntity carrinhoEntity = iterator.next();
		 * products.add(ProductController.toDTO(carrinhoEntity)); }
		 
		return products;
	}

	carrinho getProduct(final Long id) {
		final Optional<carrinhoEntity> optionalProduct = this.CarrinhoRepository.findById(id);
		if (optionalProduct.isPresent()) {
			return ProductController.toDTO(optionalProduct.get());
		}
		return carrinho.NULL_VALUE;
	}

	carrinho removeProduct(final Long id) {
		final Optional<carrinhoEntity> optionalProduct = this.CarrinhoRepository.findById(id);
		if (optionalProduct.isPresent()) {
			final carrinhoEntity carrinhoEntity = optionalProduct.get();
			this.CarrinhoRepository.delete(carrinhoEntity);
			return ProductController.toDTO(carrinhoEntity);
		}
		return carrinho.NULL_VALUE;
	}

	Long insertProduct(final carrinho carrinho) {
		final carrinhoEntity carrinhoEntity = ProductController.toEntity(carrinho);
		this.CarrinhoRepository.save(carrinhoEntity);
		return carrinhoEntity.getId();
	}

	carrinho updateProduct(final Long id, final carrinho carrinho) {
		final Optional<carrinhoEntity> optionalProduct = this.CarrinhoRepository.findById(id);
		if (optionalProduct.isPresent()) {
			final carrinhoEntity carrinhoEntity = optionalProduct.get();
			final carrinho oldcarrinho = ProductController.toDTO(carrinhoEntity);
			ProductController.updateEntityFromDTO(carrinho, carrinhoEntity);
			this.CarrinhoRepository.save(carrinhoEntity);
			return oldcarrinho;
		}
		return carrinho.NULL_VALUE;
		*/
	}

}
