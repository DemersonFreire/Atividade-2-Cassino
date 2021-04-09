package cassino;


public class Jogador {
    private static final int CartaNoJogo = 5;
    private final String Nome = "Nome";
    private String Mão[];
    private int Pontos;

    public static int getCartaJogo() {
        return CartaNoJogo;
    }

    public String getNome() {
        return Nome;
    }

    public String[] getMão() {
        return Mão;
    }

    public int getPontos() {
        return Pontos;
    }
 
    
}
