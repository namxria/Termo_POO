import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);  /* ó ana, criei esse scanner aqui e fiz o negocio da tentativo com o nome tentativa */
        Validador validador = new Validador();
        Random rand = new Random();
        int randNumber = rand.nextInt(1,5482);
        Gerador generator = new Gerador();
        String randWord;
        try {
            randWord = generator.generate(randNumber).toUpperCase();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bem vindo ao Termo! Digite uma palavra de 5 letras para começar:\n");

        int tentativas = 6;
        boolean acertou = false;
        while (tentativas > 0 && !acertou) {

            String tentativa = scanner.nextLine().toUpperCase();

            if (tentativa.length() != 5) {
                System.out.println("A palavra deve ter 5 letras. Tente novamente.\n");
                continue;
            }
            List<String> words = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("palavras.txt"));
            String line;
            while((line = br.readLine())!=null){
                words.add(line);
            }
            boolean palavraExiste = false;
            for (String word : words){
                if (tentativa.equals(word.toUpperCase())){
                    palavraExiste = true;
                    break;
                }
            }
            if (!palavraExiste){
                System.out.println("Palavra não existe. Tente novamente.\n");
                continue;
            }

            ResultadoLetra[] resultado = validador.validador(randWord, tentativa);

            for (int i = 0; i < tentativa.length(); i++) {
                System.out.print(" " + tentativa.toUpperCase().charAt(i) + "  ");
            }
            System.out.println();

            for (ResultadoLetra resultadoLetra : resultado) {
                System.out.print(Quadrado.quadradoColorido(resultadoLetra) + " ");
            }
            System.out.println("\n");

            if (tentativa.equals(randWord)) {
                System.out.println(" ");
                acertou = true; /* Aqui tem que arrumar o negócio da pontuação para ficar bonitinho */
            } else {
                tentativas--;
            }
        }
        Resultado resultado = new Resultado();
        System.out.println(resultado.showResult(tentativas) + "\nA palavra era: " + randWord);
    }
}