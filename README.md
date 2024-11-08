API teste  que faz um CRUD de tarefas de uma todo-list

Tecnologias
+ Spring Boot 
+ Spring MVC 
+ Spring Data JPA 
+ SpringDoc OpenAPI 3 
+ PostgreSQL

Práticas adotadas
 + API REST
 + Consultas com Spring Data JPA 
 + Injeção de Dependências 
 + Tratamento de respostas de erro 
 + Geração automática do Swagger com a OpenAPI 3

API Endpoints

Para fazer as requisições foi utilizado o Postman
+ Criar tarefas
Método POST url: http://localhost:8080/todos
```
{
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
 
```
+ Listar tarefas Método GET url: http://localhost:8080/todos
+ Atualizar tarefas Método PUT url: http://localhost:8080/todos
```
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }

```
+ Remover tarefa Método DELETE url: http://localhost:8080/todos/1

