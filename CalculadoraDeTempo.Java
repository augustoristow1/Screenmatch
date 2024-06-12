package br.com.alura.sreenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    // um packge exclusivo para os calculos, como por exemplo o tempo
    // que sera usado para assistir X titulos

    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // metodo:

//    public void inclui(Filme f){            // tem que fazer o import correto da classi filme
//        this.tempoTotal += f.getDuracaoEmMinutos();
//
//    }
//
//    /*
//    COMO O OBJETIVO É QUE A CALCULADORA SOME AS INFORMAÇÕES DE
//    TEMPO ENTÃO NÃO É USADO "SETTER"
//     */
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
//
//    //é nessesario aprimorar o desing das classes,
//    // ja que temos varias dependencias de classes (acoplamento)

  // fazendo um novo incluia com bom desing:

  public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
        /* como o titulo recebe tanto series, quant filmes, então
        aqui ele vai caber todos os tipos de titulo  */
            //  polimorfismo....


      System.out.println("Adicionando duração em minuros de: " + titulo);

  }

}
