package br.com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.model.Pessoa;

/**
 * 
 * @author Marcos Araujo
 *
 */

public interface IPessoaRepository extends JpaRepository<Pessoa, Long> {

}
