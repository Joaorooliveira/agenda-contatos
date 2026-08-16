# 📒 Agenda de Contatos API

Um projeto de backend construído com **Java** e **Spring Boot** para gerenciamento de uma agenda de contatos. A API permite realizar operações de CRUD (Criar, Ler, Atualizar, Deletar) de contatos, além de suportar filtros dinâmicos e avançados de busca.

## 🚀 Tecnologias Utilizadas

*   **Java**
*   **Spring Boot** (Web, Data JPA)
*   **Maven** (Gerenciamento de dependências e build)
*   **Banco de Dados** (Configurado via `application.properties`)

## 🏗️ Arquitetura e Estrutura do Projeto

O projeto foi organizado seguindo os princípios de arquitetura em camadas, visando a separação de responsabilidades e manutenção fácil:

*   **`controller/`**: Expõe os endpoints REST da API (`ContatoController`).
*   **`service/`**: Contém toda a lógica de negócio da aplicação (`ContatoService`).
*   **`repository/`**: Interfaces do Spring Data JPA para comunicação com o banco de dados (`ContatoRepository`).
*   **`domain/`**: Entidades de domínio que mapeiam as tabelas do banco de dados (`Contato`).
*   **`dto/`**: Objetos de Transferência de Dados (Data Transfer Objects) para encapsular as entradas e saídas da API de forma segura (`ContatoRequestDTO`, `ContatoResponseDTO`, etc.).
*   **`specification/`**: Implementação do padrão Specification do Spring Data para realizar consultas dinâmicas e filtragens complexas (`ContatoSpecification`).
*   **`config/`**: Configurações adicionais, como a inicialização de dados semente para o banco de dados (`DataInitializer`).

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** instalado em sua máquina (recomenda-se a versão 17 ou superior compatível com Spring Boot 3+).
2. Abra o terminal e navegue até a pasta raiz do projeto.
3. Para baixar as dependências e compilar, utilize o Maven Wrapper incluso:
   ```bash
   ./mvnw clean install
   ```
   *(No Windows, utilize `mvnw.cmd clean install`)*
4. Para iniciar o servidor localmente:
   ```bash
   ./mvnw spring-boot:run
   ```
   *(No Windows, utilize `mvnw.cmd spring-boot:run`)*

A aplicação estará rodando por padrão em `http://localhost:8080`.

## 📌 Possíveis Endpoints da API

Com base na estrutura de controladores e DTOs, a API provavelmente atende aos seguintes fluxos:
*   `POST /...` - Cria um novo contato (recebendo `ContatoRequestDTO`).
*   `GET /...` - Lista e filtra os contatos (utilizando `ContatoFiltroRequest`).
*   `PUT /.../{id}` - Atualiza as informações de um contato (`ContatoAtualizarDTO`).
*   `DELETE /.../{id}` - Deleta um contato do banco.

---

