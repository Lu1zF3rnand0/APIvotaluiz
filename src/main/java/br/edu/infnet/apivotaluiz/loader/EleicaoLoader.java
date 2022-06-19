package br.edu.infnet.apivotaluiz.loader;

import br.edu.infnet.apivotaluiz.domain.Eleicao;
import br.edu.infnet.apivotaluiz.service.EleicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EleicaoLoader implements ApplicationRunner{
	
	@Autowired
	private EleicaoService eleicaoService;
	
	@Override
	public void run(ApplicationArguments args){
		
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("Descricao Teste");
		
		
		try {
			eleicaoService.incluir(eleicao);
			System.out.println("[Sucesso - Eleicao] Inclusão realizada!");
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
		
	}

}
