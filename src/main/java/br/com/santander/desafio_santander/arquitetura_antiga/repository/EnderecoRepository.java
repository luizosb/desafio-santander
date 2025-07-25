package br.com.santander.desafio_santander.arquitetura_antiga.repository;

import br.com.santander.desafio_santander.domain.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
