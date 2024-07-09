package br.com.screenmatch.memorias.controller;


import br.com.screenmatch.memorias.dto.FrasesDTO;
import br.com.screenmatch.memorias.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Stream;

@RestController
public class FrasesController {

    @Autowired
    private FrasesService servico;

    @GetMapping("/series/frases")
    public FrasesDTO mostrarFrase() {
        return servico.mostrarFrase().findFirst().orElse(null);
    }



}
