package com.example.projetovendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

@Controller
final class PfisicaController {

	private final PfisicaRepository pfisicaRepository;
	
	public PfisicaController(final PfisicaRepository pfisicaRepository) {
		this.pfisicaRepository = pfisicaRepository;
	}
	
	private static void updateEntityFromDTO(final PessoaFisica pessoafisica, final PfisicaEntity pessoafisicaEntity) {

		pessoafisicaEntity.setCpf(pessoafisica.getCpf());
		pessoafisicaEntity.setSobrenome(pessoafisica.getSobrenome());

	}
	
	private static PfisicaEntity toEntity(final PessoaFisica pessoafisica) {

		final String cpf = pessoafisica.getCpf();
		final String sobrenome = pessoafisica.getSobrenome();

		return new PfisicaEntity(cpf, sobrenome);
	}
	
	private static PessoaFisica toDTO(final PfisicaEntity pfisicaEntity) {
		
		final long id = pfisicaEntity.getId();
		final String cpf = pfisicaEntity.getCpf();
		final String nome = pfisicaEntity.getNome();
		final String sobrenome = pfisicaEntity.getSobrenome();
		final String telefone = pfisicaEntity.getTelefone();
		final String celular = pfisicaEntity.getCelular();
		final String pais = pfisicaEntity.getPais();
		final String estado = pfisicaEntity.getEstado();
		final String cidade = pfisicaEntity.getCidade();
		final String bairro = pfisicaEntity.getBairro();
		final String rua = pfisicaEntity.getRua();
		final String cep = pfisicaEntity.getCpf();
		
		return new PessoaFisica(id, nome, sobrenome, cpf, telefone, celular, pais, estado, cidade, bairro, rua, cep);
		
	}
	
	private boolean isNotExistsProductByIdentifier(final Long id) {
		// TODO Auto-generated method stub
		return !this.pfisicaRepository.existsById(id);
	}
	
	List<PessoaFisica> getAllPessoaFisica(){
		final List<PessoaFisica> pessoafisica = new ArrayList<>();
		this.pfisicaRepository.findAll().forEach(pfisicaEntity -> pessoafisica.add(PfisicaController.toDTO(pfisicaEntity)) );
		
		return pessoafisica;
	}
	
	PessoaFisica getPessoaFisica(final Long id) {
		final Optional<PfisicaEntity> optionalPfisica = this.pfisicaRepository.findById(id);
		if (optionalPfisica.isPresent()) {
			return PfisicaController.toDTO(optionalPfisica.get());
		}
		return PessoaFisica.NULL_VALUE;
	}
	PessoaFisica removePessoaFisica(final Long id) {
		final Optional<PfisicaEntity> optionalPfisica = this.pfisicaRepository.findById(id);
		if (optionalPfisica.isPresent()) {
			final PfisicaEntity pfisicaEntity = optionalPfisica.get();
			this.pfisicaRepository.delete(pfisicaEntity);
			return PfisicaController.toDTO(pfisicaEntity);
		}
			return PessoaFisica.NULL_VALUE;
	}
	Long insertPessoaFisica(final PessoaFisica pFisica) {
		final PfisicaEntity pfisicaEntity = PfisicaController.toEntity(pessoafisica);
		this.pfisicaRepository.save(pfisicaEntity);
		return pfisicaEntity.getId();
	}
	PessoaFisica updatePessoaFisica(final Long id, final PessoaFisica pessoafisica){
		final Optional<PfisicaEntity>optionalPfisica = this.pfisicaRepository.findById(id);
		if(optionalPfisica.isPresent()) {
			final PfisicaEntity pfisicaEntity = optionalPfisica.get();
			final PessoaFisica oldPessoaFisica = PfisicaController.toDTO(pfisicaEntity);
			PfisicaController.updateEntityFromDTO(pessoafisica, pfisicaEntity);
			this.pfisicaRepository.save(pfisicaEntity);
			return oldPessoaFisica;
		}
		return PessoaFisica.NULL_VALUE;
	}
}
