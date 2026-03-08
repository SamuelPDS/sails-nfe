# 📄 Sails NFe – Fiscal Note Consumer

Sistema de **consumo e processamento de notas fiscais eletrônicas (NF-e)** desenvolvido com **Spring Boot e Java 17**.  
A aplicação consome eventos de notas fiscais via **Kafka/Redpanda**, processa as informações e persiste os dados em **PostgreSQL**, expondo APIs seguras para consulta e integração.

O projeto foi desenvolvido com foco em **arquitetura orientada a eventos**, **segurança**, e **escalabilidade**.

---

# 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Spring Kafka
- OpenFeign
- PostgreSQL
- Docker
- Kafka
- Redpanda
- Swagger / OpenAPI
- Lombok

---

# 🏗️ Arquitetura

A aplicação segue uma arquitetura baseada em **eventos**, utilizando **Kafka/Redpanda** como broker de mensagens.

Fluxo simplificado:
External API / Sistemas fiscais
│
▼
Kafka Topic
│
▼
Sails NFe Consumer (Spring Boot)
│
▼
Processamento de notas
│
▼
PostgreSQL
│
▼
REST API
│
▼
Swagger UI


---

# 📦 Funcionalidades

- Consumo de **notas fiscais via Kafka**
- Processamento e persistência de dados fiscais
- Integração com **API externa (Focus API)** via **Feign Client**
- Autenticação e segurança com **Spring Security**
- Documentação automática da API com **Swagger**
- Persistência com **PostgreSQL**
- Infraestrutura conteinerizada com **Docker**
- Compatível com **Kafka ou Redpanda**

---

# ⚙️ Configuração da Aplicação

## application.properties

```properties
spring.application.name=sails-nfe

spring.datasource.url=jdbc:postgresql://localhost:5432/fiscal-note-db
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

spring.kafka.bootstrap-servers=localhost:9092

spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer

spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer

spring.kafka.template.default-topic=sails-nfe
spring.kafka.consumer.group-id=sails-nfe-group
auto-offset-reset=latest

focus.api.url=http://localhost:8080
focus.api.username=admin
focus.api.password=admin
```

# 🐳 Executando com Docker

Para executar o projeto, é necessário possuir:

PostgreSQL
Kafka ou Redpanda

```PostgreSQL
docker run -d \
--name postgres \
-e POSTGRES_DB=fiscal-note-db \
-e POSTGRES_USER=postgres \
-e POSTGRES_PASSWORD=postgres \
-p 5432:5432 \
postgres:15

```

# 🔐 Segurança

A aplicação utiliza Spring Security com autenticação baseada em JWT / OAuth2.

Fluxo de autenticação:

Usuário realiza login

A aplicação gera um JWT Token

O token é enviado nas requisições protegidas

Header utilizado:

Authorization: Bearer {token}

Isso garante:

Autenticação segura

APIs stateless

Controle de acesso aos endpoints

📚 Documentação da API

Após iniciar a aplicação, a documentação da API estará disponível em:

http://localhost:8080/swagger-ui.html

ou

http://localhost:8080/swagger-ui/index.html