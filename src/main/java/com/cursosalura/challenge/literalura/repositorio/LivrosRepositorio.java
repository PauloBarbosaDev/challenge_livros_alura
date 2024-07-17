package com.cursosalura.challenge.literalura.repositorio;

import com.cursosalura.challenge.literalura.modelos.DadosLivros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivrosRepositorio extends JpaRepository<DadosLivros, Long> {
    List<DadosLivros> findByIdioma(String idioma);
}

