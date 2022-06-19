package br.edu.infnet.apivotaluiz.service;

import br.edu.infnet.apivotaluiz.domain.Eleitor;
import br.edu.infnet.apivotaluiz.repository.EleitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleitorService {
	
	
	@Autowired
	private EleitorRepository eleitorRepository;
	
	public void incluir (Eleitor eleitor) {
		eleitorRepository.save(eleitor);
	}
	
	public List<Eleitor> obterLista(){
		return (List<Eleitor>) eleitorRepository.findAll();
	}
	
	public void excluir(Integer id) {
		eleitorRepository.deleteById(id);
	}

}
