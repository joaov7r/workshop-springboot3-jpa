# Workshop SpringBoot + JPA

# Sobre o projeto

O workshop-springboot3-jpa é uma aplicação web desenvolvida como parte de um workshop de Spring Boot, com foco na implementação de APIs RESTful usando JPA e Hibernate para persistência de dados. O projeto está hospedado no Heroku e utiliza PostgreSQL como banco de dados em produção.

## Modelo conceitual
![Modelo Conceitual](https://github.com/joaov7r/assets/blob/main/pics/domain-model-pj-spring.png)

# Tecnologias utilizadas

- Java 17
- Spring Boot 3.x
- JPA / Hibernate
- Maven

# Banco de dados

- H2 (Desenvolvimento)
- PostgreSQL (Produção)

# Instruções sobre o banco de dados:

- No ambiente de desenvolvimento local, o projeto usa o banco de dados H2 (em memória) por padrão, o que facilita a execução local sem a necessidade de configurações adicionais.
- No ambiente de produção (Heroku), o projeto utiliza o banco de dados PostgreSQL.

# Implantação em produção

- Plataforma: Heroku

# Como executar o projeto

## Pré-requisitos

- Java 17
- Maven

## Passos para execução local (Com perfil de teste e banco H2)
```bash
# Clonar o repositório
git clone https://github.com/joaov7r/workshop-springboot3-jpa

# Navegar até o diretório do projeto
cd workshop-springboot3-jpa

# Executar o projeto com perfil de teste (H2 como banco de dados)
./mvnw spring-boot:run -Dspring-boot.run.profiles=test
```
# Acessar o banco de dados H2

## Após rodar a aplicação localmente, você pode acessar o console do H2 pelo navegador:

- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Usuário: sa
- Senha: (deixe em branco)

# Autor

João Vitor Cordeiro Lopes

https://www.linkedin.com/in/joaovitorcl
