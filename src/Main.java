import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  /* ó ana, criei esse scanner aqui e fiz o negocio da tentativo com o nome tentativa */
        Validador validador = new Validador();
        Quadrado quadrado = new Quadrado();
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

        int tentativas = 5;
        boolean acertou = false;
        while (tentativas > 0 && !acertou) {

            System.out.println("Digite a sua palavra:");
            String tentativa = scanner.nextLine();


            if (tentativa.length() != 5) {
                System.out.println("A palavra deve ter 5 letras. Tente novamente.");
                continue;
            }


            ResultadoLetra[] resultado = validador.validador(randWord, tentativa);

            for (int i = 0; i < tentativa.length(); i++) {
                System.out.print(" " + tentativa.toUpperCase().charAt(i) + " ");
            }
            System.out.println();

            for (int i = 0; i < resultado.length; i++) {
                System.out.print(quadrado.quadradocolorido(resultado[i]) + " ");

            }
            System.out.println();

            if (tentativa.equals(randWord)) {
                System.out.println(" ");
                acertou = true; /* Aqui tem que arrumar o negocio da pontuacao pra ficar bonitinho */
            } else {
                tentativas--;
                System.out.println("Tente novamente");
            }
        }
        if (!acertou){
            System.out.println("Ruim pra krl slk kkkkkkkkkkkkk");
        }
        System.out.println(randWord.charAt(0) + " " + randWord.charAt(1) + " " + randWord.charAt(2) + " " + randWord.charAt(3) + " " + randWord.charAt(4));
    }
}