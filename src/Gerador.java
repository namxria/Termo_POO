import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gerador {
    Random gerador = new Random();

    public String gerarPalavra(int random) throws IOException {
        List<String> palavras = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("palavras.txt"));
            String linha;
            while((linha = br.readLine())!=null){
                palavras.add(linha);
            }
        String palavraEscolhida = palavras.get(random);
        return palavraEscolhida;
    }

}