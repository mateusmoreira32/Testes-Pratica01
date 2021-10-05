package modulo3;

import java.util.List;
import java.util.stream.Collectors;

public class Faculdade {

    private String nome;

    private double arrecadado;

    private List<String> pessoas; //Enquanto a classe de pessoa não é criada

    private ListaBiblioteca bibliotecas;

    public Faculdade(){

    }

    public Faculdade(String nome, double arrecadado, List<String> pessoas, ListaBiblioteca bibliotecas) {
        this.nome = nome;
        this.arrecadado = arrecadado;
        this.pessoas = pessoas;
        this.bibliotecas = bibliotecas;
    }

    public void addReceita(double valor){
        arrecadado += valor;
    }

    public List<String> procurarPessoaPorNome(String nome){
        return pessoas.stream().filter(p -> p.equals(nome)).collect(Collectors.toList());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getArrecadado() {
        return arrecadado;
    }

    public void setArrecadado(double arrecadado) {
        this.arrecadado = arrecadado;
    }

    public List<String> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<String> pessoas) {
        this.pessoas = pessoas;
    }

    public ListaBiblioteca getBibliotecas() {
        return bibliotecas;
    }

    public void setBibliotecas(ListaBiblioteca bibliotecas) {
        this.bibliotecas = bibliotecas;
    }

    @Override
    public String toString() {
        return "Faculdade{" +
                "nome='" + nome + '\'' +
                ", arrecadado=" + arrecadado +
                ", pessoas=" + pessoas +
                ", bibliotecas=" + bibliotecas +
                '}';
    }
}
