package br.edu.infnet.apivotaluiz.repository;

import br.edu.infnet.apivotaluiz.domain.Eleicao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleicaoRepository extends CrudRepository<Eleicao, Integer> {

}
