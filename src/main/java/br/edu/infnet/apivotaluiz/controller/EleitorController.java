package br.edu.infnet.apivotaluiz.controller;

import br.edu.infnet.apivotaluiz.domain.Eleitor;
import br.edu.infnet.apivotaluiz.service.EleitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivotaluiz")
public class EleitorController {

	@Autowired
	private EleitorService eleitorService;
	
	@GetMapping(value = "/eleitor")
	public List<Eleitor> retornaEleitores() {
		return eleitorService.obterLista();
	}

	@PostMapping(value = "/eleitor")
	public void incluiEleitor(@RequestBody Eleitor eleitor) {
		eleitorService.incluir(eleitor);
	}

	@DeleteMapping(value = "/eleitor/{id}/excluir")
	public void excluirEleitor(@PathVariable Integer id) {
		eleitorService.excluir(id);
	}
}
