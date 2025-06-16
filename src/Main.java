import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();

        List<String> palavras = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("palavras.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                palavras.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        int numAleatorio = gerador.nextInt(5481);
        String palavraEscolhida = palavras.get(numAleatorio);
        System.out.println(palavraEscolhida);
    }
}
