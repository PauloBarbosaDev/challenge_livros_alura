package com.cursosalura.challenge.literalura.servico;

import com.cursosalura.challenge.literalura.modelos.DadosAutor;
import com.cursosalura.challenge.literalura.modelos.DadosLivros;
import com.cursosalura.challenge.literalura.repositorio.LivrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LivrosService {

    private static final String API_URL = "https://gutendex.com/books?search=";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LivrosRepositorio livrosRepositorio;

    public DadosLivros buscarLivroPorTitulo(String titulo) {
        String url = API_URL + titulo.replace(" ", "+");
        // Aqui você faria a requisição à API e converteria a resposta para DadosLivros
        // Substitua com lógica real de conversão
        // Exemplo fictício:
        // RespostaAPI response = restTemplate.getForObject(url, RespostaAPI.class);
        // return converterRespostaParaDadosLivros(response);
        return null; // Substitua por lógica real
    }

    public void salvarLivro(DadosLivros livro) {
        livrosRepositorio.save(livro);
    }

    public List<DadosLivros> listarLivros() {
        return livrosRepositorio.findAll();
    }

    public List<DadosAutor> listarAutores() {
        // Implemente esta lógica se necessário
        return null;
    }

    public List<DadosAutor> listarAutoresVivosNoAno(int ano) {
        // Implemente esta lógica se necessário
        return null;
    }

    public List<DadosLivros> listarLivrosPorIdioma(String idioma) {
        return livrosRepositorio.findByIdioma(idioma);
    }
}
