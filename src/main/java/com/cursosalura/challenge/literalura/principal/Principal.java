package com.cursosalura.challenge.literalura.principal;

import com.cursosalura.challenge.literalura.modelos.DadosLivros;
import com.cursosalura.challenge.literalura.servico.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Principal implements CommandLineRunner {

    @Autowired
    private LivrosService livrosService;

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            switch (opcao) {
                case 1:
                    System.out.print("Insira o nome do livro para pesquisa: ");
                    String titulo = scanner.nextLine();
                    DadosLivros livro = livrosService.buscarLivroPorTitulo(titulo);
                    if (livro != null) {
                        System.out.println(livro);
                        livrosService.salvarLivro(livro);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 2:
                    livrosService.listarLivros().forEach(System.out::println);
                    break;
                case 3:
                    livrosService.listarAutores().forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Insira o ano que deseja pesquisar: ");
                    int ano = scanner.nextInt();
                    livrosService.listarAutoresVivosNoAno(ano).forEach(System.out::println);
                    break;
                case 5:
                    System.out.print("Insira o idioma para realizar a busca (es, en, fr, pt): ");
                    String idioma = scanner.nextLine();
                    livrosService.listarLivrosPorIdioma(idioma).forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("************************************************");
        System.out.println("Escolha o número de sua opção:");
        System.out.println("1- Buscar livro pelo título");
        System.out.println("2- Listar livros registrados");
        System.out.println("3- Listar autores registrados");
        System.out.println("4- Listar autores vivos em um determinado ano");
        System.out.println("5- Listar livros em um determinado idioma");
        System.out.println("0 - Sair");
        System.out.println("************************************************");
    }
}
