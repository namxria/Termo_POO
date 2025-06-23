public class Quadrado {
    public static String quadradoColorido(ResultadoLetra resultado) {
        String cor;
        switch (resultado){
            case CORRETO:
                cor = "\u001B[42m"; // fundo verde
                break;
            case EXISTENTE:
                cor = "\u001B[43m"; // fundo amarelo
                break;
            case INCORRETO:
            default:
                cor = "\u001B[41m"; // fundo vermelho
                break;
        }
        String reset = "\u001B[0m";
        return cor + "   " + reset;
    }
}