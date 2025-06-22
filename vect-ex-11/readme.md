# Exercício 11 - Vetores em Java

## 📄 Descrição
O programa lê um conjunto de dados contendo a **altura** e o **gênero (M ou F)** de **N pessoas**.

Em seguida, ele calcula e exibe:
- ✅ A **maior altura** do grupo.
- ✅ A **menor altura** do grupo.
- ✅ A **média de altura das mulheres**.
- ✅ A **quantidade de homens**.

---

## 💻 Tecnologias Utilizadas
- Java
- Programação Orientada a Objetos (POO)
- Vetores (Arrays)
- Scanner (entrada de dados)
- Estruturas condicionais e laços de repetição

---

## 🚀 Funcionalidades
- Coletar altura e gênero de N pessoas.
- Calcular maior e menor altura.
- Calcular média de altura das mulheres.
- Contar a quantidade de homens no grupo.

---

## 🧠 Lógica do Programa
1. O programa solicita ao usuário a quantidade de pessoas.
2. Para cada pessoa, são coletados:
   - Altura
   - Gênero (`M` para masculino e `F` para feminino)
3. As informações são armazenadas em objetos da classe `Person`.
4. Através de laços `for`, o programa:
   - Verifica a maior e a menor altura.
   - Soma as alturas das mulheres e conta quantas são.
   - Conta quantos homens existem no grupo.
5. Por fim, os resultados são exibidos na tela.

---

## 📦 Estrutura dos Arquivos
```
/src
  ├── program
  │   └── Application.java
  └── entities
      └── Person.java
```

---

## 🏁 Como Executar
1. Clone este repositório.
2. Abra o projeto em uma IDE Java (Eclipse, IntelliJ, VS Code...).
3. Execute o arquivo `Application.java`.
4. Siga as instruções no terminal para inserir os dados.

---

## ✔️ Exemplo de Funcionamento
```
Quantas pessoas você vai digitar: 4
Digite a altura da 1ª pessoa: 1.70
Genero da 1ª pessoa: f
Digite a altura da 2ª pessoa: 1.82
Genero da 2ª pessoa: m
Digite a altura da 3ª pessoa: 1.60
Genero da 3ª pessoa: f
Digite a altura da 4ª pessoa: 1.75
Genero da 4ª pessoa: m

MENOR ALTURA: 1.60
MAIOR ALTURA: 1.82
MÉDIA DA ALTURA DAS MULHERES 1.65
QUANTIDADE DE HOMENS: 2
```

---

## ✍️ Autor
Desenvolvido por Pedro Morais como parte dos exercícios de aprendizado de Java com vetores.
