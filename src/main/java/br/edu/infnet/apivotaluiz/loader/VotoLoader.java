package br.edu.infnet.apivotaluiz.loader;

import br.edu.infnet.apivotaluiz.domain.Voto;
import br.edu.infnet.apivotaluiz.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class VotoLoader implements ApplicationRunner{

	@Autowired
	private VotoService votoService;
	
	@Override
	public void run(ApplicationArguments args) {
		
		Voto voto = new Voto();
		voto.setLocalizacao("Web");
		
		try {
			votoService.incluir(voto);
			System.out.println("[Sucesso - Voto] Inclusão realizada!");
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
	}
}
