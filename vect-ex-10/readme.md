# Exercício 10 - Vetores em Java

## 📄 Descrição
Fazer um programa para ler um conjunto de **N nomes de alunos**, bem como as **notas que eles tiraram no 1º e 2º semestres**. Cada uma dessas informações deve ser armazenada em um vetor.

Depois, o programa deve imprimir os **nomes dos alunos aprovados**, considerando como aprovados aqueles cuja **média das notas seja maior ou igual a 6.0** (seis).

---

## 💻 Tecnologias Utilizadas
- Java
- Programação Orientada a Objetos (POO)
- Vetores (Arrays)
- Estruturas condicionais e loops
- Scanner para entrada de dados

---

## 🚀 Funcionalidades
- Leitura de nome, nota do 1º semestre e nota do 2º semestre de N alunos.
- Cálculo da média das duas notas.
- Impressão dos nomes dos alunos cuja média é **maior ou igual a 6.0**.

---

## 🧠 Lógica do Programa
1. O programa solicita ao usuário quantos alunos serão digitados.
2. Para cada aluno, o usuário informa:
   - Nome
   - Nota do 1º semestre
   - Nota do 2º semestre
3. As informações são armazenadas em objetos da classe `Student`.
4. Através do método `getResult()`, a média do aluno é calculada:
   - Se a média for **>= 6.0**, o aluno é considerado **aprovado**.
5. Ao final, o programa imprime os nomes dos alunos aprovados.

---

## 📦 Estrutura dos Arquivos
```
/src
  ├── application
  │   └── Main.java
  └── entities
      └── Student.java
```

---

## 🏁 Como Executar
1. Clone este repositório.
2. Abra o projeto em uma IDE Java (Eclipse, IntelliJ, VS Code...).
3. Execute o arquivo `Main.java`.
4. Siga as instruções no terminal para inserir os dados dos alunos.

---

## ✔️ Exemplo de Funcionamento
```
Quantos alunos serao digitados? 
3
Nome: Ana
Nota 1: 7.5
Nota 2: 8.0
Nome: Bruno
Nota 1: 5.0
Nota 2: 6.0
Nome: Carlos
Nota 1: 4.0
Nota 2: 5.5

Alunos Aprovados:
Ana
Bruno
```

---

## ✍️ Autor
Desenvolvido por Pedro Morais no processo de aprendizado de Java.
