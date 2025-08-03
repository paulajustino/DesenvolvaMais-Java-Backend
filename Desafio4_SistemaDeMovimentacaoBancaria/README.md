# Mini Sistema de Movimentaçao Bancária

## Descrição
Este projeto implementa um sistema bancário simples com operações financeiras e autenticação de conta, utilizando conceitos fundamentais de Programação Orientada a Objetos (POO).

---

## Funcionalidades
- Criar contas com titular, número e saldo.
- Autenticar conta por número com limite de 3 tentativas.
- Cumprimentar usuário autenticado exibindo seu saldo atual. 
- Realizar operações bancárias:
  - Depositar (validando valor e taxa mínima).
  - Sacar (verificando saldo suficiente).
  - Transferir (para outra conta existente).
  - Pagar (verificando saldo suficiente).
- Exibir mensagens de feedback para cada operação.
- Aplicar taxa fixa de operação em todas as movimentações.

---

## Conceitos Estudados
- Modificadores de acesso:
    - private para atributos sensíveis.
    - public para métodos de uso externo.
- Encapsulamento:
    - Uso de getters para acesso seguro a dados.
- Enum:
    - Definição de TipoDeOperacaoBancaria para padronizar operações.
- Métodos auxiliares:
    - Separação de responsabilidades com BancoUtils e Menu.
- Tratamento de fluxo:
    - Controle de tentativas com do-while.
    - Estrutura de menus para repetição de operações.