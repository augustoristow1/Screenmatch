package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }


    // Metodos GETTERS

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }





    // metodos SETTERS


    public void setNome(String nome) {
        this.nome = nome;
    } // this = "DESTE OBJETO".

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }





    public void exibaFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

    }

    public  void avalia(double nota){
        somaDasAvaliacoes += nota;             // (MÉTODO)
        totalDeAvaliacao++;

    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }


}
