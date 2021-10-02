## Modulo 1
- [ ] Pessoa (Abstrata, nome, saldoCred, saldoDeb, carteira)
- [ ] Estudante (curso, Período, faculdade, matricula)
- [ ] Professor (Cadeiras que ensina, matricula)
- [ ] Bibliotecario (matricula, Gerente, Faculdade)
- [ ] Gerente (Faculdade, ResponsávelPor(Lista de funcionários))

## Modulo 2
- [ ] Emprestimo (Pessoa, Biblioteca, Valor, Lista livros)
- [ ] Devolução (Empréstimo, Pagamento)
- [ ] Pagamento Din (Descontar da conta dinheiro da pessoa, emprestimo, aplicar desconto)
- [ ] Pagamento Deb (Descontar da conta deb da pessoa, emprestimo, desconto)
- [ ] Pagamento Cred (Descontar da conta cred da pessoa, emprestimo, desconto)
- [ ] Pagamento Interface (Pessoa, emprestimo, desconto)

## Modulo 3
- [ ] ListaDeFaculdades (ListarFaculdades, Procurar por nome, filtrar por nome)
- [ ] Faculdade (lista de bibliotecas, filtrar por nome, lista de Pessoas, arrecadado)
- [ ] ListaDeBibliotecas (bibliotecas, procurar por nome)
- [ ] Biblioteca (funcionários, Gerente, lista livros, ListaDevolução, lista de emprestimo)
- [ ] TransaçãoFinanceira (faculdade, pagamento)

## Modulo 4
- [ ] ListaEmprestimo
- [ ] ListaDevolução
- [ ] ListaPessoas
- [ ] ListaLivros
- [ ] Livro

## Obs
Usar java 11 e apagar os arquivos placeholder ao criar algo na pasta.