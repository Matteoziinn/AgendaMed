# AgendaMed # 

**Descrição:**  
AgendaMed é um projeto Spring Boot que gerencia agendamentos médicos, pacientes e informações relacionadas. Ele utiliza **Spring Web**, **Spring Data JPA** e **H2 Database** para armazenamento em memória. Possui configuração para **CI/CD** via GitHub Actions e pode ser executado com Docker.

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Maven
- GitHub Actions (CI/CD)
- Docker (opcional)

---

## Como Rodar Localmente

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd AgendaMed
   ```

2. Build e run com Maven:
   ```bash
   mvn clean package
   mvn spring-boot:run
   ```

3. Acesse a aplicação no navegador:
   ```
   http://localhost:8080
   ```

---

## Acessando o H2 Console

- URL do console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Usuário: `sa`
- Senha: (deixe em branco se não tiver configurado)
- Driver Class: `org.h2.Driver`

---

## Estrutura do Projeto

```
src/
├─ main/
│  ├─ java/br/com/empresa/
│  │  └─ ... # Pacotes e classes Java
│  └─ resources/
│     ├─ application.properties
│     └─ data.sql (opcional)
```

---

## Build e Deploy via Docker

- Build da imagem:
  ```bash
  docker build -t agendamed .
  ```

- Rodar a aplicação:
  ```bash
  docker run -p 8080:8080 agendamed
  ```

---

## CI/CD com GitHub Actions

O projeto possui um pipeline configurado que:

1. Builda a aplicação com Maven
2. Executa testes
3. (Opcional) Cria imagem Docker
4. (Opcional) Faz deploy automático

Arquivo de configuração: `.github/workflows/ci-cd.yml`

---

## Membros do Projeto

- Nathalya Alves de Souza  
- Matteo Souza Caetano  
- Adison de Oliveira  
- Matheus Borges

---

## Contato

- Desenvolvedora: Nathalya Alves de Souza  
- Email: [seuemail@exemplo.com](mailto:seuemail@exemplo.com)
