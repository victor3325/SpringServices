package Usuario;

import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/usuario")
public class UsuarioService {

	@GetMapping("/{email}{senha}")
	public ResponseEntity<UsuarioDTO> Autenticar(@PathVariable(value = "email") @Valid String email, @PathVariable(value = "senha") @Valid String senha) {
		if(email == "" || senha == "") {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		//final UsuarioDTO usuarioDTO = UsuarioService
		//return new ResponseEntity<>(product, HttpStatus.OK);
	}
}
