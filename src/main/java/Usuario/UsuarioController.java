package Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

@Controller
final class UsuarioController {

	private final UsuarioRepository usuarioRepository;

	UsuarioController(final UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	private static void updateEntityFromDTO(final UsuarioDTO usuarioDTO, UsuarioEntity usuarioEntity) {
		usuarioEntity.setId(usuarioDTO.getId());
		usuarioEntity.setEmail(usuarioDTO.getEmail());
		usuarioEntity.setSenha(usuarioDTO.getSenha());
	}

	private static UsuarioEntity toEntity(final UsuarioDTO usuarioDTO) {
		final long id = usuarioDTO.getId();
		final String email = usuarioDTO.getEmail();
		final String senha = usuarioDTO.getSenha();
		return new UsuarioEntity(id, email, senha);
	}

	private static UsuarioDTO toDTO(final UsuarioEntity usuarioEntity) {
		final long id = usuarioEntity.getId();
		final String email = usuarioEntity.getEmail();
		final String senha = usuarioEntity.getSenha();
		return new UsuarioDTO(id, email, senha);
	}

	private boolean isNotExistsProductByIdentifier(final Long id) {
		// TODO Auto-generated method stub
		return !this.usuarioRepository.existsById(id);
	}

	List<UsuarioDTO> getAllUsuario() {
		final List<UsuarioDTO> usuarioDTOs = new ArrayList<>();
		this.usuarioRepository.findAll()
				.forEach(usuarioEntity -> usuarioDTOs.add(UsuarioController.toDTO(usuarioEntity)));
		return usuarioDTOs;
	}

	UsuarioDTO getUsuario(final Long id) {
		final Optional<UsuarioEntity> optionalUsuarioDTO = this.usuarioRepository.findById(id);
		if (optionalUsuarioDTO.isPresent()) {
			return UsuarioController.toDTO(optionalUsuarioDTO.get());
		}
		return UsuarioDTO.NULL_VALUE;
	}

	UsuarioDTO removeUsuario(final Long id) {
		final Optional<UsuarioEntity> optionalUsuarioDTO = this.usuarioRepository.findById(id);
		if (optionalUsuarioDTO.isPresent()) {
			final UsuarioEntity UsuarioEntity = optionalUsuarioDTO.get();
			this.usuarioRepository.delete(UsuarioEntity);
			return UsuarioController.toDTO(UsuarioEntity);
		}
		return UsuarioDTO.NULL_VALUE;
	}

	Long insertUsuario(final UsuarioDTO UsuarioDTO) {
		final UsuarioEntity UsuarioEntity = UsuarioController.toEntity(UsuarioDTO);
		this.usuarioRepository.save(UsuarioEntity);
		return UsuarioEntity.getId();
	}

	UsuarioDTO updateUsuario(final Long id, final UsuarioDTO UsuarioDTO) {
		final Optional<UsuarioEntity> optionalUsuarioDTO = this.usuarioRepository.findById(id);
		if (optionalUsuarioDTO.isPresent()) {
			final UsuarioEntity UsuarioEntity = optionalUsuarioDTO.get();
			final UsuarioDTO oldUsuarioDTO = UsuarioController.toDTO(UsuarioEntity);
			UsuarioController.updateEntityFromDTO(UsuarioDTO, UsuarioEntity);
			this.usuarioRepository.save(UsuarioEntity);
			return oldUsuarioDTO;
		}
		return UsuarioDTO.NULL_VALUE;

	}
}