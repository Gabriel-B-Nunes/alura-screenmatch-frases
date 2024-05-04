package br.com.alura.screenmatchfrases.service;

import br.com.alura.screenmatchfrases.dto.FraseDTO;
import br.com.alura.screenmatchfrases.model.Frase;
import br.com.alura.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;
    public FraseDTO obterFraseAleatoria() {
        Frase f = repository.obterFraseAleatoria();
        return new FraseDTO(f.getTitulo(), f.getFrase(), f.getPersonagem(), f.getPoster());
    }
}
