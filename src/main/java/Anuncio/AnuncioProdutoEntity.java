package Anuncio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Anuncio")
final class AnuncioProdutoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String nome;
	@Column
    private double preco_unit;
	@Column
    private int quantidade;
	@Column
    private String categoria;
	@Column
    private String moeda;
	@Column
    private String entrega;
	@Column
    private String descricao;
	@Column
    private String cidade;
	@Column
    private String estado;
	@Column
    private String pais;
	@Column
    private String cep;
	@Column
    private String imagem_produto;
	
	public AnuncioProdutoEntity(long id, String nome, double preco_unit, int quantidade, String categoria, String moeda,
			String entrega, String descricao, String cidade, String estado, String pais, String cep,
			String imagem_produto) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco_unit = preco_unit;
		this.quantidade = quantidade;
		this.categoria = categoria;
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

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco_unit() {
		return preco_unit;
	}

	public void setPreco_unit(double preco_unit) {
		this.preco_unit = preco_unit;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getcategoria() {
		return categoria;
	}

	public void setcategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public String getEntrega() {
		return entrega;
	}

	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getImagem_produto() {
		return imagem_produto;
	}

	public void setImagem_produto(String imagem_produto) {
		this.imagem_produto = imagem_produto;
	}

	@Override
	public String toString() {
		return "AnuncioProdutoEntity [id=" + id + ", nome=" + nome + ", preco_unit=" + preco_unit + ", quantidade="
				+ quantidade + ", categoria=" + categoria + ", moeda=" + moeda + ", entrega=" + entrega + ", descricao="
				+ descricao + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", cep=" + cep
				+ ", imagem_produto=" + imagem_produto + "]";
	}

	


	
}
