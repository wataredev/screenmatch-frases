package br.com.screenmatch.memorias.service;


import br.com.screenmatch.memorias.dto.FrasesDTO;
import br.com.screenmatch.memorias.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class FrasesService {

    @Autowired
    private FrasesRepository repositorio;

    public Stream<FrasesDTO> mostrarFrase() {
        return repositorio.fraseRandomizada().stream()
                .map(f -> new FrasesDTO(f.getTitulo(), f.getFrase(), f.getPersonagem(), f.getPoster()));
    }
}
