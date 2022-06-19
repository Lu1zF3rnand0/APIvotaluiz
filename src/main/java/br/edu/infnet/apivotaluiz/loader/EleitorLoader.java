package br.edu.infnet.apivotaluiz.loader;

import br.edu.infnet.apivotaluiz.domain.Eleitor;
import br.edu.infnet.apivotaluiz.service.EleitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EleitorLoader implements ApplicationRunner {
	
	@Autowired
	private EleitorService eleitorService;
	
	@Override
	public void run(ApplicationArguments args){
		
		Eleitor eleitor = new Eleitor();
		eleitor.setNome("Fernando");
		eleitor.setEmail("Luiz.silva@gmail.com");
		
		try {
			eleitorService.incluir(eleitor);
			System.out.println("[Sucesso - Eleitor] Inclusão realizada!");
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
		
		
	}

}
