package br.edu.infnet.apivotaluiz.controller;

import br.edu.infnet.apivotaluiz.domain.Candidato;
import br.edu.infnet.apivotaluiz.domain.Eleicao;
import br.edu.infnet.apivotaluiz.service.CandidatoService;
import br.edu.infnet.apivotaluiz.service.EleicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivotaluiz")
public class CandidatoController {
	
	@Autowired
	private CandidatoService candidatoService;

	@Autowired
	private EleicaoService eleicaoService;


	@GetMapping(value = "/candidato")
	public List<Candidato> retornaCandidatos() {
		return candidatoService.obterLista();
	}

	@GetMapping(value = "/candidato/{id}/candidatoPorEleicao")
	public List<Candidato> retornaCandidatosPorEleicao(@PathVariable Integer id) {
		Eleicao eleicao = eleicaoService.obterPorId(id);
		return candidatoService.obterLista(eleicao);
	}

	@PostMapping(value = "/candidato")
	public void incluiCandidator(@RequestBody Candidato candidato) {
		candidatoService.incluir(candidato);
	}

	@DeleteMapping(value = "/candidato/{id}/excluir")
	public void excluiCandidato(@PathVariable Integer id) {
		candidatoService.excluir(id);
	}
}
