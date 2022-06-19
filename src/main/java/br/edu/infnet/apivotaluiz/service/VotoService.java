package br.edu.infnet.apivotaluiz.service;

import br.edu.infnet.apivotaluiz.domain.Voto;
import br.edu.infnet.apivotaluiz.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotoService {
	
	@Autowired
	private VotoRepository votoRepository;
	
	public void incluir (Voto voto) {
		votoRepository.save(voto);
	}
	
	public List<Voto> obterLista(){
		return (List<Voto>) votoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		votoRepository.deleteById(id);
	}
}
