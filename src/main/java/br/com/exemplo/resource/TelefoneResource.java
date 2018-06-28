package br.com.exemplo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.model.Telefone;
import br.com.exemplo.repository.ITelefoneRepository;

/**
 * 
 * @author Marcos Araujo
 *
 */

@RestController
@RequestMapping("/telefones")
public class TelefoneResource {
	
	@Autowired
	private ITelefoneRepository telefoneRepository;
	
	@GetMapping
	public List<Telefone> listar() {
		return telefoneRepository.findAll();
	}

}
