# API REST para Lista de Tarefas (TODO List)

Esta simples API  permite gerenciar uma lista de tarefas, realizando operações CRUD completas.

## Tecnologias
- Java 17
- Spring 
    - Spring Boot
    - Spring Data JPA
    - SpringDoc OpenAPI 3
- Mysql
- Maven
- Lombok


## Funcionalidades

- **Listar Tarefas**: Obter a lista completa de tarefas.
- **Adicionar Tarefa**: Criar uma nova tarefa.
- **Visualizar Tarefa**: Obter detalhes de uma tarefa específica.
- **Atualizar Tarefa**: Modificar os detalhes de uma tarefa existente.
- **Excluir Tarefa**: Remover uma tarefa da lista.

## Endpoints

| Verbo Http | Caminho | Descrição |
|-------------|-------------|-------------|
| POST | /tasks   | Criar tarefa |
| GET | /tasks   | Listar tarefas |
| GET | /tasks/{id}    | Visualisar tarefa específica |
| PUT | /tasks/{id}    | Actualizar tarefa |
| DELETE | /tasks/{id}    | Excluir tarefa |


## Configuração
- Clone o repositório: git clone https://github.com/seu-usuario/nome-do-repositorio.git
- Instale as dependências: npm install
- Execute a aplicação: npm start
> Obs: Alterar o ficheiro application.properties
## Contribuição
Sinta-se à vontade para contribuir com melhorias abrindo um problema ou enviando um pull request.

## Licença
Este projeto é licenciado sob a Licença MIT.

#

# (EN) REST API for a TOD List

This Rest API allow the managment of a task list, doing complete CRUD operactions  

## Tech
- Java 17
- Spring 
    - Spring Boot
    - Spring Data JPA
    - SpringDoc OpenAPI 3
- Mysql
- Maven
- Lombok


## Functionalities

- **List Tasks**: Get the complete list of tasks.
- **Add Task**: Create a new task.
- **View Task**: Get details of a specific task.
- **Update Task**: Modify the details of an existing task.
- **Delete Task**: Remove a task from the list.

## Endpoints

| Http Verb | Path | Description |
|-------------|-------------|-------------|
| POST | /tasks | Create task |
| GET | /tasks | List tasks |
| GET | /tasks/{id} | View specific task |
| PUT | /tasks/{id} | Update task |
| DELETE | /tasks/{id} | Delete task |


## Settings
- Clone the repository: git clone https://github.com/seu-usuario/nome-do-repositorio.git
- Install dependencies: npm install
- Run the application: npm start
> Note: Change the application.properties file
## Contribution
Feel free to contribute improvements by opening an issue or submitting a pull request.

## License
This project is licensed under the MIT License.