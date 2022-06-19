package br.edu.infnet.apivotaluiz.controller;

import br.edu.infnet.apivotaluiz.domain.Eleicao;
import br.edu.infnet.apivotaluiz.service.EleicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivotaluiz")
public class EleicaoController {

    @Autowired
    private EleicaoService eleicaoService;

    @GetMapping(value = "/eleicao")
    public List<Eleicao> retornaEleicoes() {
        return eleicaoService.obterLista();
    }

    @PostMapping(value = "/eleicao")
    public void incluiEleicao(@RequestBody Eleicao eleicao) {
        eleicaoService.incluir(eleicao);
    }

    @DeleteMapping(value = "/eleicao/{id}/excluir")
    public void excluiEleicao(@PathVariable Integer id) {
        eleicaoService.excluir(id);
    }

}
