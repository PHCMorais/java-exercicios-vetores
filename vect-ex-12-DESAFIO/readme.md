# Exercício Desafio - Controle de Quartos do Pensionato 🏨

## 📄 Descrição
O programa simula o controle de aluguel de quartos de um pequeno pensionato com **10 quartos numerados de 0 a 9**, todos inicialmente vazios.

O usuário informa quantos quartos serão alugados e, para cada estudante, fornece:
- ✅ Nome
- ✅ E-mail
- ✅ Número do quarto (de 0 a 9)

Ao final, o programa exibe um **relatório dos quartos ocupados em ordem crescente**, mostrando o número do quarto, o nome e o e-mail do ocupante.

---

## 💻 Tecnologias Utilizadas
- Java
- Programação Orientada a Objetos (POO)
- Vetores (Arrays)
- Scanner (entrada de dados)
- Estruturas de repetição e condicionais

---

## 🚀 Funcionalidades
- Cadastro de estudantes em quartos.
- Verificação de ocupação de quartos.
- Geração de relatório organizado dos quartos ocupados.

---

## 🧠 Lógica do Programa
1. O programa começa com todos os quartos vazios (vetor de 10 posições).
2. O usuário informa quantos estudantes vão alugar quartos (máximo de 10).
3. Para cada estudante, são solicitados:
   - Nome
   - E-mail
   - Número do quarto (de 0 a 9), obrigatoriamente disponível.
4. Os dados são armazenados diretamente na posição correspondente do vetor `rooms`.
5. Ao final, é exibido um relatório listando:
   - Número do quarto
   - Nome do estudante
   - E-mail do estudante

---

## 📦 Estrutura dos Arquivos
```
/src
  ├── application
  │   └── Program.java
  └── entities
      └── Rooms.java
```

---

## 🏁 Como Executar
1. Clone este repositório.
2. Abra em uma IDE Java (Eclipse, IntelliJ, VS Code...).
3. Execute o arquivo `Program.java`.
4. Siga as instruções no terminal para cadastrar os estudantes e seus respectivos quartos.

---

## ✔️ Exemplo de Funcionamento
```
How many rooms will be rented? 3
Rent #1
Name: Maria Green
Email: maria@gmail.com
Room: 5
Rent #2
Name: Marco Antonio
Email: marco@gmail.com
Room: 1
Rent #3
Name: Alex Brown
Email: alex@gmail.com
Room: 8

Busy Rooms:
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail.com
```

---

## ✍️ Autor
Desenvolvido por Pedro Morais como parte dos exercícios de aprendizado de Java utilizando vetores e orientação a objetos.
