package CadastroPessoa;

public class PessoaJuridica extends CadastroPessoa{
	
	private final String cnpj;


	public PessoaJuridica(long id, String nome, String telefone, String celular, String pais, String estado,
			String cidade, String bairro, String rua, String cep, String cnpj) {
		super(id, nome, telefone, celular, pais, estado, cidade, bairro, rua, cep);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
	
}