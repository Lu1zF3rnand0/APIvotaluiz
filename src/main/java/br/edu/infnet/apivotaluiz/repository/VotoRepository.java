package br.edu.infnet.apivotaluiz.repository;

import br.edu.infnet.apivotaluiz.domain.Voto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends CrudRepository<Voto, Integer> {

}
