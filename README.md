# 📚 BooksMy

BooksMy é uma API de e-commerce de livros desenvolvida em **Java com Spring Boot**.  
O objetivo é permitir que usuários cadastrem, consultem, atualizem e removam livros.

---

## 🚀 Tecnologias
- Java 21+
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Swagger / OpenAPI

---

## ⚙️ Funcionalidades Atuais
- CRUD de livros (Create, Read, Update, Delete)
- Documentação automática com Swagger

---

## 📖 Endpoints Principais
- `GET /api/book/v1` → Lista todos os livros
- `GET /api/book/v1/{id}` → Busca um livro por ID
- `POST /api/book/v1` → Adiciona um novo livro
- `PUT /api/book/v1` → Atualiza um livro existente
- `DELETE /api/book/v1/{id}` → Remove um livro

---

## 🛠️ Como Rodar
1. Clone o repositório:
   ```bash
   git clone https://github.com/PedroAikau/BooksMy.git
   cd BooksMy
2. Configure o banco no .env (use o .env.example como base).

3. Execute:

    ```bash
   ./mvnw spring-boot:run

4. Acesse o Swagger em:
👉 http://localhost:8080/swagger-ui.html
