# Spring-Simple-Student-API

Exemplo simples demonstrando o uso e propriedade dos métodos/verbos HTTP através da manipulação de dados em um ArrayList.


| Método | Objetivo                          | CRUD   | Request Body | Idempotente¹ | Seguro² |
| :-------- | ----------------------------------- | -------- | -------------- | --------------- | ---------- |
| GET     | Obter um recurso ou grupo         | Read   | Não         | Sim           | Sim      |
| POST    | Criar um novo recurso             | Create | Sim          | Não          | Não     |
| PUT     | Atualizar um recurso inteiro      | Update | Sim          | Sim           | Não     |
| DELETE  | Deletar um recurso                | Delete | Não         | Não          | Não     |
| PATCH   | Atualizar parcialmente um recurso | Update | Sim          | Sim           | Não     |

![Alt text](image.png)

¹ Em Matemática ou Ciência da Computação, propriedade de uma operação ser aplicada mais de uma vez sem que haja alteração em seu resultado.

² Método que não altera um dado no lado servidor

## Uso local

```
$ mvn spring-boot:run 
```

## Documentação Open API

```
http://localhost:8080/swagger-ui/index.html
```

## Uso com Postman

Importar a collection spring-simple-student-api.postman_collection.json
