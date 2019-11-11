package com.example.projetovendas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Carrinh")
final class CarrinhoEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private double total;
	
	private double frete;
	
	private double total_pedido;
		
	protected CarrinhoEntity(){
		
	}
	
	public CarrinhoEntity(int id, double total, double frete, double total_pedido) {
		super();
		this.id = id;
		this.total = total;
		this.frete = frete;
		this.total_pedido = total_pedido;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public double getTotal_pedido() {
		return total_pedido;
	}
	public void setTotal_pedido(double total_pedido) {
		this.total_pedido = total_pedido;
	}
	
	@Override
	public String toString() {
		return "CarrinhoEntity [id = " + id + ", total=" + total + ", frete = " + frete + ", total_pedido=" + total_pedido +"]";
	}
	
}


