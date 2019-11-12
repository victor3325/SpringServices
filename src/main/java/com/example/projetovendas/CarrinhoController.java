package com.example.projetovendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

@Controller
final class CarrinhoController {

	private final CarrinhoRepository carrinhoRepository;

	CarrinhoController(final CarrinhoRepository carrinhoRepository) {
		this.carrinhoRepository = carrinhoRepository;
	}

	private static void updateEntityFromDTO(final Carrinho carrinho, final CarrinhoEntity carrinhoEntity) {
		carrinhoEntity.setId(carrinho.getId());
		carrinhoEntity.setValor_unitario(carrinho.getValor_unitario());
		carrinhoEntity.setValor_frete(carrinho.getvalor_Frete());
		carrinhoEntity.setTotal_pedido(carrinho.getTotal_pedido());
	}

	private static CarrinhoEntity toEntity(final Carrinho carrinho) {
		final int id = carrinho.getId();
		final double valor_unitario = carrinho.getValor_unitario();
		final double valor_frete = carrinho.getvalor_Frete();
		final double total_pedido = carrinho.getTotal_pedido();
		return new CarrinhoEntity(id,valor_unitario, valor_frete, total_pedido);
	}

	private static Carrinho toDTO(final CarrinhoEntity carrinhoEntity) {

		final int id = carrinhoEntity.getId();
		final double valor_unitario = carrinhoEntity.getValor_unitario();
		final double valor_frete = carrinhoEntity.getValor_frete();
		final double total_pedido = carrinhoEntity.getTotal_pedido();
		return new Carrinho(id,valor_unitario, valor_frete, total_pedido);
	}

	private boolean isNotExistsProductByIdentifier(final Long id) {
		// TODO Auto-generated method stub
		return !this.carrinhoRepository.existsById(id);
	}

	List<Carrinho> getAllCarrinho() {
		final List<Carrinho> carrinho = new ArrayList<>();
		this.carrinhoRepository.findAll().forEach(carrinhoEntity -> carrinho.add(CarrinhoController.toDTO(carrinhoEntity)));
		return carrinho;
	}

	Carrinho get(final Long id) {
		final Optional<CarrinhoEntity> optionalCarrinho = this.carrinhoRepository.findById(id);
		if (optionalCarrinho.isPresent()) {
			return CarrinhoController.toDTO(optionalCarrinho.get());
		}
		return Carrinho.NULL_VALUE;
	}

	Carrinho removeCarrinho(final Long id) {
		final Optional<CarrinhoEntity> optionalCarrinho = this.carrinhoRepository.findById(id);
		if (optionalCarrinho.isPresent()) {
			final CarrinhoEntity carrinhoEntity = optionalCarrinho.get();
			this.carrinhoRepository.delete(carrinhoEntity);
			return CarrinhoController.toDTO(carrinhoEntity);
		}
		return Carrinho.NULL_VALUE;
	}

	int insertCarrinho(final Carrinho carrinho) {
		final CarrinhoEntity carrinhoEntity = CarrinhoController.toEntity(carrinho);
		this.carrinhoRepository.save(carrinhoEntity);
		return carrinhoEntity.getId();
	}

	Carrinho updateProduct(final Long id, final Carrinho carrinho) {
		final Optional<CarrinhoEntity> optionalCarrinho = this.carrinhoRepository.findById(id);
		if (optionalCarrinho.isPresent()) {
			final CarrinhoEntity carrinhoEntity = optionalCarrinho.get();
			final Carrinho oldcarrinho = CarrinhoController.toDTO(carrinhoEntity);
			CarrinhoController.updateEntityFromDTO(carrinho, carrinhoEntity);
			this.carrinhoRepository.save(carrinhoEntity);
			return oldcarrinho;
		}
		return carrinho.NULL_VALUE;
		
	}

}
