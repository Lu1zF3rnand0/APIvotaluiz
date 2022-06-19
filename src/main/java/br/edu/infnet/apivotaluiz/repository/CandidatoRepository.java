package br.edu.infnet.apivotaluiz.repository;

import br.edu.infnet.apivotaluiz.domain.Candidato;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatoRepository extends CrudRepository<Candidato, Integer> {

	@Query("from Candidato c where c.eleicao.id = :eleicaoId")
    List<Candidato> findAll(Integer eleicaoId);


}
