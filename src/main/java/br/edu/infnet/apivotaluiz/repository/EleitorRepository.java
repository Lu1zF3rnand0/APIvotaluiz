package br.edu.infnet.apivotaluiz.repository;

import br.edu.infnet.apivotaluiz.domain.Eleitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleitorRepository extends CrudRepository<Eleitor, Integer> {

}
