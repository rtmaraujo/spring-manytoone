package br.com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.exemplo.model.Pessoa;
import br.com.exemplo.model.Telefone;

/**
 * 
 * @author Marcos Araujo
 *
 */

public interface ITelefoneRepository extends JpaRepository<Telefone, Long> {

	@Query("SELECT h FROM Telefone h WHERE h.pessoa = ?1")
	public Telefone buscarPorIdPessoa(Pessoa pessoa);
}
