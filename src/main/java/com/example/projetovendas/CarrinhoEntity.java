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
	public CarrinhoEntity(final int id, final Double total, final Double frete, final Double total_pedido) {
		this.id = id;
		this.total = total;
		this.total_pedido = total_pedido;
		
	}
	
	@Override
	public String toString() {
		return "CarrinhoEntity [id = " + id + ", total=" + total + ", frete = " + frete + ", total_pedido=" + total_pedido +"]";
	}
	public int getId() {
		return this.id;
	}
	public void setId(final int id) {
		this.id = id;
	}
	public String getTotal() {
		return this.total_pedido;
	}
	public String setTotal
}


