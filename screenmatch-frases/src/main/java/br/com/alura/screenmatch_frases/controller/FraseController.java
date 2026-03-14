package br.com.alura.screenmatch_frases.controller;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.service.FraseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    private FraseService servico;

    public FraseController(FraseService servico) {
        this.servico = servico;
    }

    @GetMapping("/frases")
    public FraseDTO obterFrase() {
        return servico.obterFraseAleatoria();
    }

}
