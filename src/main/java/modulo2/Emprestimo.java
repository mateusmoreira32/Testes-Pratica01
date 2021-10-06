package modulo2;
import modulo1.Pessoa;
import modulo4.Livro;

import java.util.Date;
import java.util.List;

public class Emprestimo {
  
  private Pessoa usuario;
  private Date dataEmprestimo;
  private Date dataDevolucao;
  private List<Livro> livros;
  
  public Emprestimo(Pessoa usuario, Date dataEmprestimo, Date dataDevolucao, List<Livro> livros) {
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livros = livros;
    }

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
