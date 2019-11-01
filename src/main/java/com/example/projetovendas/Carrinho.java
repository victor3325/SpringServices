package com.example.projetovendas;

public class Carrinho {
	
	private int id;
	private double total;
	private double frete;
	private double total_pedido;
	
	public Carrinho(int id, double total, double frete, double total_pedido) {
		super();
		this.id = id;
		this.total = total;
		this.frete = frete;
		this.total_pedido = total_pedido;
	}

	public int getId() {
		return id;
	}

	public double getTotal() {
		return total;
	}

	public double getFrete() {
		return frete;
	}

	public double getTotal_pedido() {
		return total_pedido;
	}
	
	

}
