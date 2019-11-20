package CadastroPessoa;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoajuridica")

public class PjuridicaService{
	
	private static final PessoaJuridica [] Pj = new PessoaJuridica[]{
		new PessoaJuridica(1, "Vinícius", "Colombo", "Mario", "78946136549870", "4712345678", "47123456789", "Brasil", "Santa Catarina", "Blumenau", "Vila", "Rua Kreutz", "89000-600"),
		new PessoaJuridica(2, "Victor", "Gonçalves", "Marcio", "9876543217890", "4798765432", "47987654321", "Brasil", "Santa Catarina", "Blumenau", "Tribes", "Rua Fonte", "89123-000")
	};
	
	@GetMapping("/list")
	public PessoaJuridica[] list() {
		return PjuridicaService.Pj;
	}
	@GetMapping("/{id}")
	public ResponseEntity<PessoaJuridica> getPessoaJuridica (@PathVariable(value = "id") @Valid int id){
		if(id < 0 || id >PjuridicaService.Pj.length) {
			
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		final PessoaJuridica pessoaj = PjuridicaService.Pj[id];
		return new ResponseEntity<>(pessoaj,HttpStatus.OK);
	}
}