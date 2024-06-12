import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento( 1970 );
        meuFilme.setDuracaoEmMinutos( 180 );
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibaFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacao());
        System.out.println((meuFilme.pegaMedia()));

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento( 1990 );
        lost.exibaFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        System.out.println("DUração: " + lost.getDuracaoEmMinutos());


    }
}
