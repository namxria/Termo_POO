public class Quadrado {
    public static String mostrarStatus(Status resultado) {
        String cor;
        switch (resultado){
            case CORRETO:
                cor = "\u001B[42m";
                break;
            case EXISTENTE:
                cor = "\u001B[43m";
                break;
            case INCORRETO:
            default:
                cor = "\u001B[41m";
                break;
        }
        String reset = "\u001B[0m";
        return cor + "   " + reset;
    }
}