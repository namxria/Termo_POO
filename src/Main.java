import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Validador validador = new Validador();
        Gerador gerador = new Gerador();
        String palavraAleatoria;
        try {
            palavraAleatoria = gerador.gerarPalavra();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bem vindo ao Termo! Digite uma palavra de 5 letras para começar:\n");

        int quantTentativas = 6;
        boolean acertou = false;
        while (quantTentativas > 0 && !acertou) {

            String tentativa = leitor.nextLine().toUpperCase();

            if (tentativa.length() != 5) {
                System.out.println("A palavra deve ter 5 letras. Tente novamente.\n");
                continue;
            }
            List<String> palavras = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("palavras.txt"));
            String linha;
            while((linha = br.readLine())!=null){
                palavras.add(linha);
            }
            boolean palavraExiste = false;
            for (String palavra : palavras){
                if (tentativa.equals(palavra.toUpperCase())){
                    palavraExiste = true;
                    break;
                }
            }
            if (!palavraExiste){
                System.out.println("Palavra não existe. Tente novamente.\n");
                continue;
            }

            Status[] resultado = validador.validarPalavra(palavraAleatoria, tentativa);

            for (int i = 0; i < tentativa.length(); i++) {
                System.out.print(" " + tentativa.toUpperCase().charAt(i) + "  ");
            }
            System.out.println();

            for (Status resultadoLetra : resultado) {
                System.out.print(Quadrado.mostrarStatus(resultadoLetra) + " ");
            }
            System.out.println("\n");

            if (tentativa.equals(palavraAleatoria)) {
                System.out.println(" ");
                acertou = true;
            } else {
                quantTentativas--;
            }
        }
        Resultado resultado = new Resultado();
        System.out.println(resultado.fimDeJogo(quantTentativas) + "\nA palavra era: " + palavraAleatoria);
        leitor.close();
    }
}