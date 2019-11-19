package CadastroPessoa;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pessoafisica")

public class PfisicaService {
	
	private static final PessoaFisica [] Pf = new PessoaFisica[] {
			new PessoaFisica(1, "Pedro", "Heifler", "99999999999", "4799999999", "47988888888", "Brasil", "Santa Catarina", "Blumenau", "Garcia", "Pedro 2 alves", "89000-000"),
			new PessoaFisica(2, "Miguel", "Zimm", "78945613285", "4788888888", "47977777777", "Brasil", "Ascura", "Ascura Pequena", "Ascurrinha", "Dr Ascurrar", "89000-001")
	};

	private final PfisicaController pfisicaController;
	
	public PfisicaService(final PfisicaController pfisicaController) {
		this.pfisicaController = pfisicaController;
		Arrays.asList(PfisicaService.Pf).forEach(dto -> this.pfisicaController.inse);

	}
	@GetMapping("/list")
	
	
	@GetMapping("/{id}")

}


