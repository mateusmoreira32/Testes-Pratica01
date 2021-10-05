package modulo3;

import java.util.List;

public class Biblioteca {

    private String nome;

    private String gerente; //Enquanto a classe de gerente não é criada

    private List<String> livros; //Enquanto a classe livro não é criada

    private List<String> devolucao; //enquanto a classe devolução não é criada

    private List<String> emprestimo; //enquanto a classe emprestimo não é criada

    public boolean possueLivro(String nome){
        return livros.stream().filter(p -> p.equals(nome)).count() >= 1;
    }

    public boolean possuiLivros(List<String> lista){
        return livros.stream().filter(lista::contains).count() == lista.size();
    }

    public double precoDoParaEmprestimo(int quant){
        return quant * 0.5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public List<String> getLivros() {
        return livros;
    }

    public void setLivros(List<String> livros) {
        this.livros = livros;
    }

    public List<String> getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(List<String> devolucao) {
        this.devolucao = devolucao;
    }

    public List<String> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(List<String> emprestimo) {
        this.emprestimo = emprestimo;
    }
}


