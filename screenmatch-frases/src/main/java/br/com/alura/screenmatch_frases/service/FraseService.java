package br.com.alura.screenmatch_frases.service;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.model.Frase;
import br.com.alura.screenmatch_frases.repository.FraseRepository;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    private final FraseRepository repositorio;

    public FraseService(FraseRepository repositorio) {
        this.repositorio = repositorio;
    }

    public FraseDTO obterFraseAleatoria(){
        Frase frase = repositorio.buscarFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),
                        frase.getFrase(),
                        frase.getPersonagem(),
                        frase.getPoster());
    }

}
