package br.com.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliações;
    private int totalDeAvaliações;

    public void exibeFichaTecnica() {
        System.out.println(String.format("Nome do filme: %s", nome));
        System.out.println(String.format("Ano de lançamento: %d", anoDeLancamento));
        System.out.println(String.format("Duração em minutos: %d", duracaoEmMinutos));
        System.out.println(String.format("Incluído no plano: %b", incluidoNoPlano));
    }

    public void avalia(double nota){
        somaDasAvaliações += nota;
        totalDeAvaliações++;
    }

    public double pegaMedia(){
        return somaDasAvaliações/totalDeAvaliações;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliações() {
        return totalDeAvaliações;
    }
}
