```markdown
# 🎮 GameList

## 📖 Sobre o Projeto

O **GameList** é uma API desenvolvida para gerenciar listas de jogos. Com ele, você pode consultar todos os jogos, buscar por gênero, e até alterar a posição dos jogos dentro de uma lista. Esse projeto é perfeito para quem deseja aprender ou explorar desenvolvimento backend com Java e Spring Boot.

---

## 🚀 Tecnologias Utilizadas

- **Linguagem:** Java 21  
- **Framework:** Spring Boot 3.4.2  
- **Gerenciador de Dependências:** Maven  
- **Banco de Dados:**
  - **Produção e Homologação:** PostgreSQL
  - **Testes:** H2  
- **IDE:** Spring Tools Suite 4  

---

## 🖥️ Como Usar

### Criando o Projeto com o Spring Initializr

1. Acesse o [Spring Initializr](https://start.spring.io/).
2. Configure o projeto:
   - **Project:** Maven
   - **Language:** Java (Lastest and stable)
   - **Spring Boot:** 3.4.2
3. Adicione as dependências:
   - Spring Web
   - Spring Data JPA
   - PostgreSQL Driver
   - H2 Database
4. Baixe o projeto gerado e importe-o na sua IDE (Spring Tools Suite ou outra de sua preferência).
5. Configure o banco de dados no arquivo `application.properties` ou `application.yml`.

---

## 🌐 Endpoints Disponíveis para Testes Locais

### **GET**

- **Buscar todos os jogos:**
  ```plaintext
  http://localhost:8080/games
  ```
- **Buscar um jogo por ID:**
  ```plaintext
  http://localhost:8080/games/{id}
  ```
  Exemplo: `http://localhost:8080/games/4`
- **Buscar os gêneros dos jogos:**
  ```plaintext
  http://localhost:8080/lists
  ```
- **Buscar os jogos de um gênero específico:**
  ```plaintext
  http://localhost:8080/lists/{id}/games
  ```
  Exemplo: `http://localhost:8080/lists/2/games`

---

### **POST**

- **Alterar a posição de um jogo dentro de uma lista:**
  ```plaintext
  http://localhost:8080/lists/{id}/replacement
  ```
  Exemplo: `http://localhost:8080/lists/2/replacement`

  **Body (JSON):**
  ```json
  {
    "sourceIndex": 1,
    "destinationIndex": 3
  }
  ```

---

## 📂 Estrutura do Projeto

```plaintext
GameList/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.guilhermebomfim.gamelist/
│   │   │       ├── controllers/
│   │   │       ├── models/
│   │   │       ├── repositories/
│   │   │       ├── services/
│   │   │       └── dto/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/
│       └── ...
├── pom.xml
└── README.md
```

---

## 📜 Licença

Este projeto é licenciado sob a [MIT License](LICENSE).  

---

Feito com 💻 e ☕ por **[Guilherme Bomfim](https://github.com/GuilhermeBomfimDev)**.  
```
