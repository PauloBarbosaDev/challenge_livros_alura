package com.cursosalura.challenge.literalura.repositorio;

import com.cursosalura.challenge.literalura.modelos.DadosAutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoresRepositorio extends JpaRepository<DadosAutor, Long> {
    List<DadosAutor> findByAnoNascimentoLessThanEqualAndAnoFalecimentoGreaterThanEqual(int anoNascimento, int anoFalecimento);
}
