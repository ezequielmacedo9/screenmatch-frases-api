# ScreenMatch - API de Frases de Filmes e Séries

Projeto desenvolvido durante o curso **Java: criando sua primeira API e conectando ao front**, da Alura.

A aplicação consiste em uma **API REST construída com Spring Boot** que retorna frases icônicas de filmes e séries de forma aleatória, permitindo que um frontend consuma essas informações e exiba dinamicamente na interface.

---

# Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

---

# Funcionalidades

A API disponibiliza frases de filmes e séries contendo:

- Título
- Frase
- Personagem
- Poster

O frontend consome o endpoint e exibe dinamicamente essas informações, permitindo que o usuário visualize diferentes frases ao clicar no botão **"Ver outras frases"**.

---

# Endpoint principal

```
GET /series/frases
```

---

# Exemplo de resposta JSON

```json
{
  "titulo": "Rocky",
  "frase": "It ain’t about how hard you hit. It’s about how hard you can get hit and keep moving forward.",
  "personagem": "Rocky Balboa",
  "poster": "https://upload.wikimedia.org/wikipedia/en/1/18/Rocky_poster.jpg"
}
```

---

# Arquitetura do projeto

O projeto segue uma **arquitetura em camadas**, comum em aplicações backend desenvolvidas com **Spring Boot**.  
Essa organização separa responsabilidades e facilita manutenção, escalabilidade e testes.

## Camadas da aplicação

### Controller

Responsável por expor os endpoints da API.  
Recebe as requisições HTTP do frontend e retorna as respostas em formato JSON.

Exemplo de endpoint:

```
GET /series/frases
```

---

### Service

Camada responsável pelas **regras de negócio da aplicação**.

Aqui acontece a lógica que define:

- qual frase será retornada
- como os dados devem ser tratados
- comunicação entre Controller e Repository

---

### Repository

Camada responsável pelo **acesso ao banco de dados**.

Utiliza o **Spring Data JPA** para realizar operações como:

- buscar dados
- salvar registros
- consultar informações

---

### DTO (Data Transfer Object)

Classe utilizada para **transferir dados entre backend e frontend**.

Ela evita expor diretamente as entidades do banco de dados e permite retornar apenas as informações necessárias para o frontend.

---

### Model (Entity)

Representa as **entidades persistidas no banco de dados**.

Cada entidade corresponde a uma tabela no banco.

Exemplo de campos da entidade `Frase`:

- id
- titulo
- frase
- personagem
- poster

---

# Banco de dados

Foi utilizado **PostgreSQL** para armazenar as frases e informações das séries e filmes.

Cada registro contém:

- título da série ou filme
- frase icônica
- personagem que citou a frase
- link do poster

Essas informações são consumidas pela API e retornadas para o frontend em formato JSON.

---

# Como executar o projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/ezequielmacedo9/screenmatch-frases-api.git
```

---

## 2. Entrar na pasta do projeto

```bash
cd screenmatch-frases-api
```

---

## 3. Configurar o banco PostgreSQL

Crie um banco de dados e configure as credenciais no arquivo:

```
application.properties
```

Exemplo:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/screenmatch
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

---

## 4. Executar o projeto

Utilizando Maven:

```bash
mvn spring-boot:run
```

Ou executando diretamente pela IDE.

---

## 5. Acessar a API

Depois de iniciar o projeto, acesse no navegador:

```
http://localhost:8080/series/frases
```

A API retornará uma frase aleatória em formato JSON.

---

# Objetivo do projeto

Este projeto teve como objetivo praticar conceitos fundamentais de desenvolvimento backend com Java, incluindo:

- criação de APIs REST com Spring Boot
- organização de código em arquitetura em camadas
- integração com banco de dados PostgreSQL
- uso de DTOs para comunicação entre backend e frontend
- consumo da API por uma interface frontend

Este projeto faz parte da jornada de aprendizado em **desenvolvimento backend com Java e Spring Boot**.

---

# Autor

**Ezequiel Macedo**

GitHub  
https://github.com/ezequielmacedo9
