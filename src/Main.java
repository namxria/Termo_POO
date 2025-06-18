import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(1,5482);
        Gerador generator = new Gerador();
        String randWord;
        try {
            randWord = generator.generate(randNumber).toUpperCase();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bem vindo ao Termo! Digite uma palavra de 5 letras para começar.\n_ _ _ _ _");
        System.out.println(randWord.charAt(0) +" "+ randWord.charAt(1) +" "+ randWord.charAt(2) +" "+ randWord.charAt(3) +" "+ randWord.charAt(4));

    }
}