package CadastroPessoa;

public class PessoaJuridicaDTO{
	private final int id;
	private final String nome;
	private final String sobrenome;
	private final String responsavel;
	private final String cnpj;
	private final String telefone;
	private final String celular;
	private final String pais;
	private final String estado;
	private final String cidade;
	private final String bairro;
	private final String rua;
	private final String cep;
	

	public PessoaJuridicaDTO(int id, String nome, String sobrenome, String responsavel, String cnpj, String telefone,
			String celular, String pais, String estado, String cidade, String bairro, String rua, String cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.responsavel = responsavel;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.celular = celular;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCelular() {
		return celular;
	}

	public String getPais() {
		return pais;
	}

	public String getEstado() {
		return estado;
	}

	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getRua() {
		return rua;
	}

	public String getCep() {
		return cep;
	}


}
