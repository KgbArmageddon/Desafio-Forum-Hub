# Desafio-Forum-HubFórumHub: API REST para Gestão de Tópicos

Este é o repositório do projeto FórumHub, criado como parte do desafio "Praticando Spring Framework: Challenge Fórum Hub da Alura". O objetivo do projeto é desenvolver uma API REST completa para gerenciar tópicos em um fórum, implementando funcionalidades de CRUD, validações, persistência em banco de dados relacional e autenticação/autorização.

Funcionalidades Principais

CRUD de Tópicos: Criar, listar, atualizar e deletar tópicos do fórum.

Validações: Garantir integridade dos dados enviados.

Persistência: Utilização de banco de dados relacional (H2).

Autenticação e Autorização: Configurar acesso seguro à API.

Estrutura do Projeto

A estrutura do projeto segue os padrões do Spring Boot:

forumhub/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/forumhub/
│   │   │       ├── ForumHubApplication.java
│   │   │       ├── controller/
│   │   │       │   └── TopicoController.java
│   │   │       ├── model/
│   │   │       │   └── Topico.java
│   │   │       ├── repository/
│   │   │       │   └── TopicoRepository.java
│   │   │       ├── dto/
│   │   │       │   └── TopicoDTO.java
│   │   │       ├── service/
│   │   │       │   └── TopicoService.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       └── data.sql
├── pom.xml

Configuração do Ambiente

Pré-requisitos

Java 17 ou superior

Maven para gerenciar dependências

Passos para Executar o Projeto

Clone o repositório:

git clone https://github.com/seu-usuario/forumhub.git
cd forumhub

Configure o ambiente:
Certifique-se de que o Java e o Maven estão instalados e configurados no seu sistema.

Execute a aplicação:

mvn spring-boot:run

Acesse a API:
A aplicação estará disponível em: http://localhost:8080.

Endpoints Disponíveis

Tópicos

Criar um Tópico

POST /topicos

Body (JSON):

{
  "titulo": "Título do Tópico",
  "mensagem": "Conteúdo do tópico",
  "autor": "Autor do Tópico",
  "curso": "Curso relacionado"
}

Listar Tópicos

GET /topicos

Deletar um Tópico

DELETE /topicos/{id}

Dependências do Projeto

As principais dependências utilizadas no projeto são:

Spring Boot Starter Web: Para construção de APIs REST.

Spring Boot Starter Data JPA: Para persistência de dados.

H2 Database: Banco de dados em memória para desenvolvimento e testes.

Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

Licença

Este projeto é licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

