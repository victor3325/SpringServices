package Endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Endereco")
final class EnderecoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String pais;
	@Column
	private String estado;
	@Column
	private String cidade;
	@Column
	private String bairro;
	@Column
	private String rua;
	@Column
	private String cep;
	
	public EnderecoEntity(long id, String pais, String estado, String cidade, String bairro, String rua, String cep) {
		super();
		this.id = id;
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "EnderecoEntity [id=" + id + ", pais=" + pais + ", estado=" + estado + ", cidade=" + cidade + ", bairro="
				+ bairro + ", rua=" + rua + ", cep=" + cep + "]";
	}
		
	
}
