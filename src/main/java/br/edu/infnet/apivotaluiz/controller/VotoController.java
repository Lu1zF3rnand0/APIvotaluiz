package br.edu.infnet.apivotaluiz.controller;

import br.edu.infnet.apivotaluiz.domain.Voto;
import br.edu.infnet.apivotaluiz.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivotaluiz")
public class VotoController {

    @Autowired
    private VotoService votoService;

    @GetMapping(value = "/voto")
    public List<Voto> retornaVotos() {
        return votoService.obterLista();
    }


    @PostMapping(value = "/voto")
    public void incluiVoto(@RequestBody Voto voto) {
        votoService.incluir(voto);
    }

    @DeleteMapping(value = "/voto/{id}/excluir")
    public void excluiVoto(@PathVariable Integer id) {
        votoService.excluir(id);
    }
}
