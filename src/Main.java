import br.com.screenmatch.modelos.Filme;

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

        System.out.println(String.format("Média de avaliações: %f", favorito.pegaMedia()));
    }
}