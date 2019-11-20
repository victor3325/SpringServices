package CadastroPessoa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PessoaFisica")
final class PfisicaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private  long id;	
	private  String nome;
	private  String sobrenome;
	private  String cpf;
	private  String telefone;
	private  String celular;
	private final String pais;
	private final String estado;
	private final String cidade;
	private final String bairro;
	private final String rua;
	private final String cep;
	
	
	protected PfisicaEntity() {
		
	}
	public PfisicaEntity(long id, String nome, String sobrenome, String cpf, String telefone, String celular,
			String pais, String estado, String cidade, String bairro, String rua, String cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.celular = celular;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
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
	@Override
	public String toString() {
		return "PfisicaEntity [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf
				+ ", telefone=" + telefone + ", celular=" + celular + ", pais=" + pais + ", estado=" + estado
				+ ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", cep=" + cep + "]";
	}

	

}
