package br.edu.infnet.apivotaluiz.service;

import br.edu.infnet.apivotaluiz.domain.Candidato;
import br.edu.infnet.apivotaluiz.domain.Eleicao;
import br.edu.infnet.apivotaluiz.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository candidatoRepository;
	
	public void incluir (Candidato candidato) {
		candidatoRepository.save(candidato);
	}
	
	public List<Candidato> obterLista(){
		return (List<Candidato>) candidatoRepository.findAll();
	}
	
	public List<Candidato> obterLista(Eleicao eleicao){
		return (List<Candidato>) candidatoRepository.findAll(eleicao.getId());
	}
	
	public void excluir(Integer id) {
		candidatoRepository.deleteById(id);
	}

}
