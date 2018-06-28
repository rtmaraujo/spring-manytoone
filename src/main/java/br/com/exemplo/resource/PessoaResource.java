package br.com.exemplo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.model.Pessoa;
import br.com.exemplo.repository.IPessoaRepository;

/**
 * 
 * @author Marcos Araujo
 *
 */
@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
	
	@Autowired
	private IPessoaRepository pessoaRepository;
	
	@GetMapping
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
}
