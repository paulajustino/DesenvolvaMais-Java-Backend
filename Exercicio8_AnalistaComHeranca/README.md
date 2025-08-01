# Classe Analista com Herança

## Descriçao
Este projeto implementa uma classe **Analista** que herda de uma classe base **Funcionario**. 
O objetivo é sobrescrever o método calcularSalario() para retornar o valor base do cargo somado a um bônus fixo.

---

## Funcionalidades
- Criar analista com **nome**.
- Calcular salario do analista.

---

## Conceitos Estudados
- Herança: Analista estende Funcionario.
- Classe abstrata: Funcionario define um contrato para calcularSalario().
- Constantes (final static): uso de BONUS_BASE e SALARIO_BASE para padronização.
- Polimorfismo: sobrescrita do método calcularSalario() na subclasse.