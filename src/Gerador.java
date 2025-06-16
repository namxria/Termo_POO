import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gerador {

    public String generate(int random) throws IOException {
        List<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("palavras.txt"));
            String line;
            while((line = br.readLine())!=null){
                words.add(line);
            }
        String word = words.get(random);
        return word;
    }
}