# ScreenMatch - API de Frases de Filmes e Séries

Projeto desenvolvido durante o curso **Java: criando sua primeira API e conectando ao front**, da Alura.

A aplicação consiste em uma **API REST construída com Spring Boot** que retorna frases icônicas de filmes e séries de forma aleatória, permitindo que um frontend consuma essas informações e exiba dinamicamente na interface.

---

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

---

## Funcionalidades

A API disponibiliza frases de filmes e séries contendo:

- Título
- Frase
- Personagem
- Poster

O frontend consome o endpoint e exibe dinamicamente essas informações, permitindo que o usuário visualize diferentes frases ao clicar no botão **"Ver outras frases"**.

---

## Endpoint principal



### Exemplo de resposta JSON

```json
{
  "titulo": "Rocky",
  "frase": "It ain’t about how hard you hit. It’s about how hard you can get hit and keep moving forward.",
  "personagem": "Rocky Balboa",
  "poster": "https://upload.wikimedia.org/wikipedia/en/1/18/Rocky_poster.jpg"
}

Arquitetura do projeto

O projeto segue uma arquitetura em camadas, comum em aplicações backend com Spring Boot:

Controller → responsável por expor os endpoints da API

Service → camada de regras de negócio

Repository → responsável pelo acesso ao banco de dados

DTO → responsável pela transferência de dados entre backend e frontend

Model → representa as entidades persistidas no banco

Banco de dados

Foi utilizado PostgreSQL para armazenar as frases e informações das séries e filmes.

Como executar o projeto

Clone o repositório


git clone https://github.com/ezequielmacedo9/screenmatch-frases-api.git



Configure o banco de dados PostgreSQL

Execute o projeto


mvn spring-boot:run



Acesse no navegador


http://localhost:8080/series/frases


Objetivo do projeto

Este projeto teve como objetivo aplicar conceitos importantes de desenvolvimento backend, como:

criação de APIs REST

integração com banco de dados

arquitetura em camadas

comunicação entre backend e frontend

Autor

Ezequiel Macedo

GitHub: https://github.com/ezequielmacedo9


---

# Post para LinkedIn (encerramento do curso)

Use esse texto para publicar no LinkedIn.

Ele é **profissional, mas natural**.

---

Hoje finalizei o curso **“Java: criando sua primeira API e conectando ao front”** da :contentReference[oaicite:0]{index=0}.

Durante o curso desenvolvi uma **API REST utilizando Spring Boot**, que fornece frases icônicas de filmes e séries de forma aleatória e permite que um frontend consuma essas informações dinamicamente.

Nesse projeto pratiquei conceitos importantes de desenvolvimento backend, como:

- criação de endpoints REST
- arquitetura em camadas (Controller, Service e Repository)
- uso de DTOs para transferência de dados
- integração com banco de dados PostgreSQL
- comunicação entre backend e frontend

Foi uma ótima experiência para consolidar fundamentos de **Java e desenvolvimento de APIs**, além de reforçar boas práticas de organização de código.

Projeto disponível no GitHub:  
https://github.com/ezequielmacedo9/screenmatch-frases-api

Continuando a jornada de aprendizado e evolução no desenvolvimento backend 🚀

#Java #SpringBoot #Backend #API #PostgreSQL #DesenvolvimentoDeSoftware

---

✅ Se quiser, posso também te mostrar **como transformar esse projeto simples em um projeto de portfólio muito mais forte (coisa que faz recrutador parar no seu GitHub)** adicionando **3 endpoints extras e documentação da API**.
