# Sistema de Reembolso de Despesas

## Descrição
Este projeto implementa um sistema simples para cálculo de reembolso de despesas para funcionários.  
Cada funcionário pode solicitar reembolso de despesas com **alimentação**, **transporte** e **hospedagem**, com regras específicas e aplicação de **bônus** quando aplicável.

---

## Funcionalidades
- Calcular o reembolso considerando:
    - Alimentação + Transporte + Hospedagem
    - Alimentação + Transporte
- Aplicar **bônus de 10%** no reembolso total para funcionários com **mais de 7 dias trabalhados**.
- Validar valores informados (não permitir valores negativos).
- Exibir resumo do reembolso formatado.

---

## Conceitos Estudados
- Declaração de classes e atributos
- Construtores e inicialização de objetos
- Sobrecarga de métodos
- Encapsulamento
- Validação de dados
- Uso de varargs (double...) para validação dinâmica
- Lógica condicional para regras de negócio
- Métodos auxiliares privados para regras de negócio e organizaçao do código
- Saída formatada com System.out.printf()

