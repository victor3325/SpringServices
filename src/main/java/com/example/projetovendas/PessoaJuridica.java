package com.example.projetovendas;

public class PessoaJuridica extends CadastroPessoa {
	private final String responsavel;
	private final String cnpj;
	
	public PessoaJuridica(int id, String nome, String telefone, String celular, String pais, String estado,
			String cidade, String bairro, String rua, String cep, String responsavel, String cnpj) {
		super(id, nome, telefone, celular, pais, estado, cidade, bairro, rua, cep);
		this.responsavel = responsavel;
		this.cnpj = cnpj;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public String getCnpj() {
		return cnpj;
	}
	
 	
	
}
