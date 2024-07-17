# LiterAlura - Catálogo de Livros

![Badge](https://img.shields.io/badge/Java-17-blue)
![Badge](https://img.shields.io/badge/SpringBoot-2.7.1-brightgreen)
![Badge](https://img.shields.io/badge/PostgreSQL-13.4-blue)
![Badge](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

## Índice

- [Descrição do Projeto](#descrição-do-projeto)
- [Status do Projeto](#status-do-projeto)
- [Funcionalidades e Demonstração da Aplicação](#funcionalidades-e-demonstração-da-aplicação)
- [Como os Usuários Podem Utilizá-lo](#como-os-usuários-podem-utilizá-lo)
- [Acesso ao Projeto](#acesso-ao-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Licença](#licença)

## Descrição do Projeto

O projeto **LiterAlura** tem como objetivo criar um catálogo de livros consumindo a API Gutendex, uma API gratuita de livros, e praticar a persistência de dados em um banco de dados relacional (PostgreSQL). A aplicação permite buscar livros por título diretamente na API, listar livros e autores registrados, listar autores vivos em um determinado ano e listar livros em determinados idiomas.

## Status do Projeto

![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

## Funcionalidades e Demonstração da Aplicação

### Funcionalidades

- **Buscar livro pelo título:** Realiza a consulta diretamente na API e insere o livro no banco de dados.
- **Listar livros registrados:** Exibe todos os livros cadastrados no banco de dados.
- **Listar autores registrados:** Exibe todos os autores cadastrados no banco de dados.
- **Listar autores vivos em um determinado ano:** Permite buscar autores vivos em um determinado ano.
- **Listar livros em um determinado idioma:** Permite buscar livros por idioma (espanhol, inglês, francês, português).

### Demonstração da Aplicação

```plaintext
************************************************
Escolha o número de sua opção:
1- Buscar livro pelo título
2- Listar Livros registrados
3- Listar autores registrados
4- Listar autores vivos em um determinado ano
5- Listar livros em um determinado idioma
0 - Sair
************************************************
```

## Como os Usuários Podem Utilizá-lo

### Para utilizar a aplicação, siga os passos abaixo:

1. Clone o repositório para sua máquina local:
   ```
   - git clone https://github.com/Ludnoe/challengeAluraLiteralura
   ```
2. Navegue até o diretório do projeto:
   ```
   - cd literalura
   ```
3. Configure o banco de dados PostgreSQL conforme as instruções no arquivo application.properties.

4. Execute a aplicação usando sua IDE preferida (recomendamos IntelliJ IDEA) ou através do terminal:
   ```
   - mvn spring-boot:run
   ```

### Acesso ao Projeto

Você pode acessar o projeto através do [repositório no GitHub](https://github.com/Ludnoe/challengeAluraLiteralura).

### Tecnologias Utilizadas

- Java 17
- Spring Boot 2.7.1
- PostgreSQL 13.4
- Maven
- Gutendex API

### Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
