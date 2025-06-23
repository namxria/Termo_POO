public class Validador {
    public ResultadoLetra[] validador(String palavraCorreta, String tentativa) {

        ResultadoLetra[] resultado = new ResultadoLetra[palavraCorreta.length()]; /*dai aqui eu jogo a palavra sorteada em uma lista*/
        boolean[] letrasUsadas = new boolean[palavraCorreta.length()]; /*e aqui eu fiz uma lista só dizendo se as posições dela são verdadeiros ou falços*/


        for (int i = 0; i < palavraCorreta.length(); i++){
            if (tentativa.charAt(i) == palavraCorreta.charAt(i)){  /*dai comparo cada letra da tentativa com a palavra, e se tiver certo eu do o valor CORRETO pra marca a corzinha depois*/
                resultado[i] = ResultadoLetra.CORRETO;
                letrasUsadas[i] = true; /*tambem atualizo a lista dizendo que a posição é verdadeira, dai o validador pula ele nas outras validações*/
            }
        }


        for (int i = 0; i < palavraCorreta.length(); i++){
            if (resultado[i] != null) continue;       /*dai eu fiz isso aqui no meio pro validador que é true e não mexer*/


            boolean morno = false;
            for (int j = 0; j < palavraCorreta.length(); j++){
                if (!letrasUsadas[j] && tentativa.charAt(i) == palavraCorreta.charAt(j)) { /*isso aqui foi paia de fazer, se quiser entender a chapassao pede audio*/
                    morno = true; /*morno quer dizer que tem a letra, nao quis botar a variavel EXISTE mas nao muda nada esse nomezinho */
                    letrasUsadas[j] = true;
                    break;
                }

            }
            resultado[i] = morno ? ResultadoLetra.EXISTENTE : ResultadoLetra.INCORRETO; /*descobri isso e achei mt foda, ta dizendo, a posição i ta morno? se sim resultado existe, se nao incorreto :)*/

        }
        return resultado;
    }
}