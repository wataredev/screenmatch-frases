package br.com.screenmatch.memorias.repository;

import br.com.screenmatch.memorias.model.DadosFrases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FrasesRepository extends JpaRepository<DadosFrases, Long> {

    @Query(value = "SELECT * FROM frases ORDER BY random() LIMIT 1", nativeQuery = true)
    Optional<DadosFrases> fraseRandomizada();
}
