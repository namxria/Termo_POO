import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gerador {

    public String gerarPalavra() throws IOException {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1,5482);
        List<String> palavras = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("palavras.txt"));
        String linha;
        while((linha = br.readLine())!=null){
            palavras.add(linha);
        }
        return palavras.get(numeroAleatorio).toUpperCase();
    }
}