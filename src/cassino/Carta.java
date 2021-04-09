package cassino;


public enum Carta {
    Dois("2", 2), Tres("3", 3), Quatro("4", 4), Cinco("5", 5), Seis("6", 6), 
    Sete("7", 7), Oito("8", 8), Nove("9", 9), Dez("10", 10), J("Valete", 11), 
    Q("Dama", 12), K("Rei", 13), A("Ás", 14);
    
    private final String nome;
    private final int pontos;

    private Carta(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }
    
    
}
