package br.edu.infnet.apivotaluiz.service;

import br.edu.infnet.apivotaluiz.domain.Candidato;
import br.edu.infnet.apivotaluiz.domain.Eleicao;
import br.edu.infnet.apivotaluiz.repository.EleicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleicaoService {

	@Autowired
	private EleicaoRepository eleicaoRepository;
	
	public void incluir (Eleicao eleicao) {
		eleicaoRepository.save(eleicao);
	}
	
	public List<Eleicao> obterLista(){
		return (List<Eleicao>) eleicaoRepository.findAll();
	}
	
	public Eleicao obterPorId(Integer id) {
		return eleicaoRepository.findById(id).orElse(null);
	}
	
	public void excluir(Integer id) {
		eleicaoRepository.deleteById(id);
	}

	public Candidato resultadoEleicao(Eleicao eleicao){
		var qtd = 0;
		Candidato ganhador = null;
		for (Candidato candidato:eleicao.getCandidatos()) {
			if (candidato.getVotos().size() > qtd){
				qtd = candidato.getVotos().size();
				ganhador = candidato;
			}
		}
		return ganhador;
	}

}
