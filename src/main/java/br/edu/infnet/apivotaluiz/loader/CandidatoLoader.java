package br.edu.infnet.apivotaluiz.loader;

import br.edu.infnet.apivotaluiz.domain.Candidato;
import br.edu.infnet.apivotaluiz.domain.Eleicao;
import br.edu.infnet.apivotaluiz.service.CandidatoService;
import br.edu.infnet.apivotaluiz.service.EleicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CandidatoLoader implements ApplicationRunner {

	@Autowired
	private CandidatoService candidatoService;

	@Autowired
	private EleicaoService eleicaoService;
	
	@Override
	public void run(ApplicationArguments args) {

//		Eleicao eleicao = new Eleicao();
//		eleicao.setDescricao("Eleicao 2022");
//		eleicaoService.incluir(eleicao);

		
		Candidato candidato = new Candidato();
		candidato.setNome("Luiz");
		candidato.setNumero(123);
//		candidato.setEleicao(eleicao);
		
		try {
			candidatoService.incluir(candidato);
			System.out.println("[Sucesso - Candidato] Inclusão realizada!");
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
		
		
		
	}
}
