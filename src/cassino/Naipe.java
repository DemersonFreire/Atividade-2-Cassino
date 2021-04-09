package cassino;


public enum Naipe {
    Paus("Paus"), Ouros("Ouros"), Copas("Copas"), Espadas("Espadas");
    
    private final String nome;

    private Naipe(String nome) {
        this.nome = nome;
    }
    

    public String getNome() {
        return nome;
    }
    
}
