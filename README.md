# picpaysimplificado
## Desafio backend junior

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![H2](https://img.shields.io/badge/h2-%236DB33F.svg?style=for-the-badge&logo=h2&logoColor=white)

Esse projeto é uma construção de API usando **Java, Java Spring e Banco de dados em memória(H2)**

## Tabela de conteúdos

- [Instalação](#instalação)
- [Uso](#uso)
- [API Endpoints](#api-endpoints)

## Instalação

1. Copie o repositório:

```bash
git clone https://github.com/OliverBR1/picpaysimplificado.git
```

2. Instalar dependências do Maven

3. Crie uma configuração de conexão com o banco de dados no arquivo `application.properties`

```yaml
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

// para visualizar o console do h2
spring.h2.console.enabled=true
```

## Uso

1. Execute a aplicação no Maven
2. A Api é acessada nesse caminho http://localhost:8080

## API Endpoints
A API fornece os seguintes endpoints:

**API USER**
```markdown
POST /api/users - Criar um novo usuário
GET /api/users - Receber todas os  usuários

```

**BODY**
```json
{
  "firstname": "Bruno",
  "lastname": "Oliveira",
  "document": "12345679",
  "password": "1234567",
  "email":"teste@gmail.com",
  "balance": 10,
  "userType": "COMMON"
}
```

**API TRANSACTIONS**
```markdown
POST /api/transacitions - Criar uma nova transação


```

**BODY**
```json
{
  "senderId": 1,
  "receiverId": 2,
  "value": 10
}
