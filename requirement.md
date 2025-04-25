## Demanda V1

### Informaç�es sobre a demanda

Objetivo ser� desenvolver um sistema de gerenciamento para estacionamento.
AP�s levantamento de requisitos junto ao cliente, listaremos a especificaç�es a serem desenvolvidas pela equipe.

- Importante salientar que o sistema ser� uma API Rest como autenticaç�o por Json Web Token (JWT).
- O sistema dever� possuir uma documentaç�o dos recursos disponiveis pela API, para servir de apoio a equipe front-end.

Nesta primeira vers�o temos os seguintes requisitos a serm desenvolvidos.

### 1. Requisitos e Configuraç�es

- [] A API deve ser configurada com timezone do Brasil
- [] A API deve ser configurada com o Locale do Brasil
- [] A API deve usar um sistema de auditoria
  - [] Registrar a data de criaç�o e �ltima modificaç�a do registros
  - [] Registrar o usu�rio que criou e o �ltimo que modificou um registro
- [] Configurar o acesso a uma base de dados para ambiente de desenvolvimento


### 2. Requisitos/Usu�rios

- [] O usu�rio deve ter um e-mail, o qual ser� usado como username(deve ser �nico)
- [] O usu�rio deve ter uma senha de no min 6 caracters e max 255
- [] O usu�rio deve ter um perfil de administrador ou cliente
- [] O usu�rio ser� criado sem a necessidade de autenticaç�o
- [] O usu�rio poder� ser localizado pelo identificador gerado
    - [] O administrador, quando autenticado, poder� recuperar qualquer usu�rio pelo id.
    - [] O cliente quando autenticado, poder� somente recuperar seus pr�prios dados de usu�rios
