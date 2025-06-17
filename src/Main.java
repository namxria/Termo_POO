import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(1,5482);
        Gerador generator = new Gerador();
        String randWord;
        try {
            randWord = generator.generate(randNumber);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(randWord);
    }
}