# API Sistema de Pedidos

## Descrição do Projeto
Uma aplicação Java que demonstra o uso de Spring Boot, Hibernate, JPA, Maven e MySQL para realizar operações CRUD em um banco de dados.

## Objetivo
Este projeto tem como objetivo demonstrar proficiência em:

### Desenvolvimento em Java
- **Programação Orientada a Objetos:**
  - Encapsulamento
  - Herança
  - Polimorfismo
  - Abstração
- **Boas Práticas:**
  - Padrões de projeto
  - Princípios SOLID
  - Refatoração
  - Testes unitários

### Arquitetura em 3 Camadas
- **Camada de Apresentação (Controller)**
- **Camada de Negócio (Service)**
- **Camada de Acesso a Dados (Repository)**

### Aplicações Diretas

#### Aprendizado
- Reforçar conceitos e boas práticas em Java
- Aplicar conhecimento em um projeto do mundo real
- Desenvolver habilidades de resolução de problemas

#### Funcionalidades
- Implementar operações CRUD (Criar, Ler, Atualizar, Excluir)
- Gerenciar dados de forma eficiente
- Criar interfaces de usuário intuitivas

### Destaques do Projeto
- **Boas práticas de desenvolvimento:**
  - Código limpo e bem documentado
  - Testes unitários para garantir a qualidade do código
  - Arquitetura modular e reutilizável
- **Aplicabilidade em diferentes cenários:**
  - O projeto pode ser adaptado para diversas necessidades
  - Serve como base para projetos mais complexos
- **Contribuição para a comunidade:**
  - Compartilhamento do código-fonte para aprendizado e colaboração

## Tecnologias Utilizadas
- **Java 17**  
- **Spring Boot 3.3.2**  
- **Hibernate 5.6.10.Final**  
- **JPA 2.2**  
- **Maven 3.8.6**  

## Endpoints da API

- **GET /api/users:** Obter todos os usuários  
- **POST /api/users:** Criar um novo usuário  
- **GET /api/users/{id}:** Obter um usuário pelo ID  
- **PUT /api/users/{id}:** Atualizar um usuário pelo ID  
- **DELETE /api/users/{id}:** Excluir um usuário pelo ID  

## Testando a API
Você pode usar o Postman ou qualquer outro cliente REST para testar os endpoints da API.

### Exemplos de uso no Postman:
1. **GET** `/api/users` - Para listar todos os usuários
2. **POST** `/api/users` - Para criar um novo usuário
3. **GET** `/api/users/{id}` - Para buscar um usuário específico pelo ID
4. **PUT** `/api/users/{id}` - Para atualizar os dados de um usuário
5. **DELETE** `/api/users/{id}` - Para deletar um usuário específico
