import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numAleatorio = gerador.nextInt(5481+1);
        Gerador gerar = new Gerador();
        String palavraAleatoria;
        try {
            palavraAleatoria = gerar.generate(numAleatorio);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(palavraAleatoria);
    }
}