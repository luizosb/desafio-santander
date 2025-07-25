package br.com.santander.desafio_santander.infra.persistance;

import br.com.santander.desafio_santander.domain.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {

    EnderecoEntity findByCep(String cep);
}
