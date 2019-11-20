package Anuncio;


public class AnuncioProdutoDTO {
		
	
	
		private final long id;
		private final String nome;
	    private final double preco_unit;
	    private final int quantidade;
	    private final String categoria;
	    private final String moeda;
	    private final String entrega;
	    private final String descricao;
	    private final String cidade;
	    private final String estado;
	    private final String pais;
	    private final String cep;
	    private final String imagem_produto;
	    
		public AnuncioProdutoDTO(long id, String nome, double preco_unit, int quantidade, String categoria, String moeda,
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
		public String getNome() {
			return nome;
		}
		public double getPreco_unit() {
			return preco_unit;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public String getcategoria() {
			return categoria;
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
