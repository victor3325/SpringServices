package com.example.projetovendas;

public class PessoaFisica extends CadastroPessoa{
	private final String cpf;
	private final String sobrenome;
	public PessoaFisica(int id, String nome, String telefone, String celular, String pais, String estado, String cidade,
			String bairro, String rua, String cep, String cpf, String sobrenome) {
		super(id, nome, telefone, celular, pais, estado, cidade, bairro, rua, cep);
		this.cpf = cpf;
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	
}
