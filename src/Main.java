import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.calculos.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("La La Land: Cantando Estações");
        favorito.setAnoDeLancamento(2016);
        favorito.setDuracaoEmMinutos(128);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(10);
        favorito.avalia(6);
        favorito.avalia(9);

        System.out.println(String.format("Média de avaliações: %f \n", favorito.pegaMedia()));

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        lost.setEpisodiosPorTemporada(10);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Jumanji");
        outroFilme.setAnoDeLancamento(2018);
        outroFilme.setDuracaoEmMinutos(119);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}