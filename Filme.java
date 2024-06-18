package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo{ // extençao de herança TITULO

    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
