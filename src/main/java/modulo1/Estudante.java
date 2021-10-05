package modulo1;

import modulo3.Faculdade;

public class Estudante extends Pessoa{
    private String curso;
    private int periodo;
    private Faculdade faculdade;
    private String matricula;

    public Estudante() {
    }

    public Estudante(String nome, int idade, String sexo, String curso, int periodo, Faculdade faculdade, String matricula) {
        super(nome, idade, sexo);
        this.curso = curso;
        this.periodo = periodo;
        this.faculdade = faculdade;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean validarPeriodo(){
        return periodo > 0 && periodo <= 8;
    }

    public boolean validaMatricula(){
        if(matricula.isEmpty() || matricula.isBlank()){
            return false;
        }else if(matricula.length() < 8){
            return false;
        }else{
            try {
                Integer.parseInt(matricula);
            }catch (Exception e){
                return false;
            }
            return true;
        }
    }
}
