# Bootcamp Spring Boot - Módulo Spring Boot

## Descrição
Este módulo faz parte do Bootcamp **Claro - Java com Spring Boot**, focando no **Spring Boot**, um framework que simplifica a criação de aplicações Java robustas e escaláveis. Durante este módulo, exploramos os principais conceitos e ferramentas do Spring Boot, desde a configuração inicial até o desenvolvimento de APIs RESTful, gerenciamento de dependências, e integração com bancos de dados.

## Conteúdos Abordados
- Introdução ao Spring Boot
- Configuração de um projeto Spring Boot
- Arquitetura REST com Spring Boot
- Desenvolvimento de APIs RESTful
- Manipulação de dados com JPA e Spring Data
- Testes automatizados com JUnit e Mockito
- Gerenciamento de dependências com Maven
- Integração com bancos de dados (H2, MySQL)
- Monitoramento e métricas com Actuator
- Deploy e ambientes de produção

## Tecnologias Utilizadas
- **Java**: Linguagem principal utilizada no desenvolvimento de aplicações Spring Boot.
- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **Maven**: Gerenciador de dependências.
- **JPA (Java Persistence API)**: Framework para mapeamento objeto-relacional.
- **H2 Database**: Banco de dados em memória usado para testes.
- **MySQL**: Banco de dados relacional para persistência de dados.
- **JUnit/Mockito**: Ferramentas para testes unitários e de integração.

## Pré-requisitos
Antes de iniciar o projeto, certifique-se de ter instalado as seguintes ferramentas:
- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [IntelliJ IDEA ou VSCode](https://www.jetbrains.com/idea/download/) com suporte a Spring
- [Git](https://git-scm.com/)

## Como Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/ThiagoRAlmeida2/BootCamp_Spring.git
    ```
2. Acesse a pasta do projeto:
   ```bash
    cd BootCamp_Spring
    ```
3. Execute o projeto:
    ```bash
   mvn BootCamp_Spring:run
    ```
4. Acesse a aplicação no navegador:
    ```bash
   http://localhost:8080
   ```
   
## Estrutura do projeto
## Estrutura do Projeto
O projeto segue a seguinte estrutura de pacotes:

```bash
src
├── main
│   ├── java
│   │   └── Dio.BootCamp
│   │       ├── App
│   │       ├── BootCampApplication
│   │       └── Calculadora
│   └── resources
│       └── application.properties
├── test
│   └── java
│       └── Dio.BootCamp
│           └── BootCampApplicationTest
```
- **App**: Minha aplicação
- **BootCampApplication**: Arquivo responsavel pelo Run
- **Calculadora**: Arquivo de reste, fazendo uma pequena soma
- **application.properties**: Configurações do projeto.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir **issues** e **pull requests**.

## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/thiago-ribeiro-139727260/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:thiagoralmeida23@gmail.com)
[![GitHub](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/ThiagoRAlmeida2)