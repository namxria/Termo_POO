public class Validador {
    public Status[] validarPalavra(String palavraCorreta, String tentativa) {

        Status[] resultado = new Status[palavraCorreta.length()];
        boolean[] letrasUsadas = new boolean[palavraCorreta.length()];


        for (int i = 0; i < palavraCorreta.length(); i++){
            if (tentativa.charAt(i) == palavraCorreta.charAt(i)){
                resultado[i] = Status.CORRETO;
                letrasUsadas[i] = true;
            }
        }


        for (int i = 0; i < palavraCorreta.length(); i++){
            if (resultado[i] != null) continue;


            boolean morno = false;
            for (int j = 0; j < palavraCorreta.length(); j++){
                if (!letrasUsadas[j] && tentativa.charAt(i) == palavraCorreta.charAt(j)) {
                    morno = true;
                    letrasUsadas[j] = true;
                    break;
                }

            }
            resultado[i] = morno ? Status.EXISTENTE : Status.INCORRETO;

        }
        return resultado;
    }
}