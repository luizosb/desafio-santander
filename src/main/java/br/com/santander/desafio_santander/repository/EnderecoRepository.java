package br.com.santander.desafio_santander.repository;

import br.com.santander.desafio_santander.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
