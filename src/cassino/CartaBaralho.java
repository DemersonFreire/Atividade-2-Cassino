package cassino;

import java.security.SecureRandom;
import javax.swing.ImageIcon;


public class CartaBaralho {
    
    private Carta carta;
    private Naipe naipe;
    private static ImageIcon image;
    private static SecureRandom SortCarta = new SecureRandom();

    public CartaBaralho(Carta carta, Naipe naipe, ImageIcon image) {
        this.carta = carta;
        this.naipe = naipe;
        this.image = image;
    }

    public Carta getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public ImageIcon getImage() {
        return image;
    }
    
    
    
    public static CartaBaralho [] geraBaralho() {
        int tamanhoBaralho = Naipe.values().length * Carta.values().length;
        CartaBaralho baralho[] = new CartaBaralho[tamanhoBaralho];
        int idx = 0;
        
        for(Naipe naipe : Naipe.values())
            for(Carta carta : Carta.values())
                baralho[idx++] = new CartaBaralho(carta, naipe, image);
        for(int first = 0; first < baralho.length; first++) {
            int second = SortCarta.nextInt(tamanhoBaralho);
            CartaBaralho aux = baralho[first];
            baralho[first] = baralho[second];
            baralho[second] = aux;
        }
        return baralho;
        
    }
    
    
    
}
