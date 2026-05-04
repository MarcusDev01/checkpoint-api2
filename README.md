# 🚀 API REST - Checkpoint 2 (Microservices & Web Engineering) - API 2

## 📚 Descrição

Este projeto foi desenvolvido como parte do Checkpoint 2 da disciplina **Microservices and Web Engineering**.

A aplicação consiste em uma API RESTful construída com Spring Boot, responsável pelo gerenciamento de dados relacionados a **Emissoras de TV** e **Premiações do Oscar**, permitindo operações de CRUD (Create, Read, Update, Delete) com persistência em banco de dados MySQL.

---

## 🛠️ Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Docker
* Swagger / OpenAPI

---

## ⚙️ Como executar o projeto

### 🔹 1. Clonar o repositório

```bash
git clone https://github.com/MarcusDev01/checkpoint-api2
```

---

### 🔹 2. Subir o banco de dados com Docker

Certifique-se de ter o Docker instalado e em execução.

Execute o comando abaixo na raiz do projeto:

```bash
docker-compose up -d
```

Isso irá subir um container MySQL com as seguintes configurações:

* Banco: `checkpoint`
* Usuário: `root`
* Senha: `root`
* Porta: `3306`

---

### 🔹 3. Configurar a aplicação

O arquivo `application.properties` já está configurado:

```properties
server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/checkpoint
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 🔹 4. Executar a aplicação

Você pode rodar pelo IntelliJ ou via terminal:

```bash
mvn spring-boot:run
```

---

## 🌐 Acesso à API

A API estará disponível em:

```
http://localhost:8080
```

---

## 📖 Documentação Swagger

Acesse a documentação interativa em:

```
http://localhost:8080/swagger-ui.html
```

---

## 📌 Endpoints da API

### 📺 Emissoras

| Método | Endpoint          | Descrição      |
| ------ | ----------------- | -------------- |
| GET    | `/emissoras`      | Listar todas   |
| GET    | `/emissoras/{id}` | Buscar por ID  |
| POST   | `/emissoras`      | Criar emissora |
| PUT    | `/emissoras/{id}` | Atualizar      |
| DELETE | `/emissoras/{id}` | Deletar        |

---

### 🏆 Oscars

| Método | Endpoint       | Descrição      |
| ------ | -------------- | -------------- |
| GET    | `/oscars`      | Listar todos   |
| GET    | `/oscars/{id}` | Buscar por ID  |
| POST   | `/oscars`      | Criar registro |
| PUT    | `/oscars/{id}` | Atualizar      |
| DELETE | `/oscars/{id}` | Deletar        |

---

## 🧪 Exemplo de JSON (POST - Oscar)

```json
{
  "filme": "Oppenheimer",
  "categoria": "Melhor Filme",
  "ano": 2024,
  "diretor": "Christopher Nolan",
  "descricao": "Filme premiado"
}
```

---

## 🐳 Estrutura do Docker

Arquivo `docker-compose.yml`:

```yaml
services:
  mysql:
    image: mysql:8
    container_name: mysql-checkpoint
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: checkpoint
    ports:
      - "3306:3306"
```

---

## 🧠 Observações

* As tabelas são criadas automaticamente pelo Hibernate (`ddl-auto=update`)
* O projeto segue o padrão MVC (Model, Controller, Repository)
* As entidades utilizam nomenclatura singular e tabelas no plural
* A API está totalmente integrada ao banco de dados MySQL

---

## 👨‍💻 Autor

Marcus Vinicius
Projeto acadêmico - FIAP
