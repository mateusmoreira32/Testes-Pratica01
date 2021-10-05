package modulo1;

import modulo3.Faculdade;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Pessoa{

    Faculdade faculdade;
    List<Pessoa> encarregados;

    public Gerente() {
    }

    public Gerente(String nome, int idade, String sexo, Faculdade faculdade, List<Pessoa> encarregados) {
        super(nome, idade, sexo);
        this.faculdade = faculdade;
        this.encarregados = encarregados;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public List<Pessoa> getEncarregados() {
        return encarregados;
    }

    public void setEncarregados(List<Pessoa> encarregados) {
        this.encarregados = encarregados;
    }

    public boolean isFull(){
        List<Class> classesFound = new ArrayList<>();
        for(Pessoa p : encarregados){
            if(!classesFound.contains(p.getClass())){
                classesFound.add(p.getClass());
            }
        }
        return classesFound.size() == 3;
    }

}
