package Usuario;

public class UsuarioDTO {
	
	
	public static final UsuarioDTO NULL_VALUE = new UsuarioDTO(Long.valueOf(0), String.valueOf(""), String.valueOf(""));
	private final Long id;
	private String email;
	private String senha;

	public UsuarioDTO(Long id, String email, String senha) {
		this.id = id;
		this.email = email;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
