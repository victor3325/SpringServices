package Carrinho;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Carrinho")
final class CarrinhoEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private double valor_unitario;
	
	private double valor_frete;
	
	private double total_pedido;
		
	protected CarrinhoEntity(){
		
	}
	
	public CarrinhoEntity(long id, double valor_unitario, double valor_valor_valor_frete, double total_pedido) {
		super();
		this.id = id;
		this.valor_unitario = valor_unitario;
		this.valor_frete = valor_valor_valor_frete;
		this.total_pedido = total_pedido;
	}

	
	public void setId(long id) {
		this.id = id;
	}

	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	public void setValor_frete(double valor_frete) {
		this.valor_frete = valor_frete;
	}

	public void setTotal_pedido(double total_pedido) {
		this.total_pedido = total_pedido;
	}

	public long getId() {
		return id;
	}

	public double getValor_unitario() {
		return valor_unitario;
	}

	public double getValor_frete() {
		return valor_frete;
	}

	public double getTotal_pedido() {
		return total_pedido;
	}

	@Override
	public String toString() {
		return "CarrinhoEntity [id = " + id + ", valor_unitario=" + valor_unitario + ", valor_frete = " + valor_frete + ", total_pedido=" + total_pedido +"]";
	}
	
	
}


