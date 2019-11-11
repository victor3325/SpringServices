package com.example.projetovendas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Anuncio")
public class AnuncioProdutoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	@Column
	private final String nome;
	@Column
    private final double preco_unit;
	@Column
    private final int quantidade;
	@Column
    private final String tipo;
	@Column
    private final String moeda;
	@Column
    private final String entrega;
	@Column
    private final String descricao;
	@Column
    private final String cidade;
	@Column
    private final String estado;
	@Column
    private final String pais;
	@Column
    private final String cep;
	@Column
	
    private final String imagem_produto;
	public AnuncioProdutoEntity(long id, String nome, double preco_unit, int quantidade, String tipo, String moeda,
			String entrega, String descricao, String cidade, String estado, String pais, String cep,
			String imagem_produto) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco_unit = preco_unit;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.moeda = moeda;
		this.entrega = entrega;
		this.descricao = descricao;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cep = cep;
		this.imagem_produto = imagem_produto;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco_unit() {
		return preco_unit;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public String getMoeda() {
		return moeda;
	}
	public String getEntrega() {
		return entrega;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getPais() {
		return pais;
	}
	public String getCep() {
		return cep;
	}
	public String getImagem_produto() {
		return imagem_produto;
	}
	
	
}
