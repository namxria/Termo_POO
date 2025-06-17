public class Resultado extends Pontuacao {
    public String showResult(Pontuacao numTries){
        String message = "";
        if (numTries == Pontuacao.FIRST){
            message = "";
        } else if (numTries == Pontuacao.SECOND){
            message = "";
        } else if (numTries == Pontuacao.THIRD){
            message = "";
        } else if (numTries == Pontuacao.FORTH){
            message = "";
        } else if (numTries == Pontuacao.FIFTH){
            message = "";
        } else if (numTries == Pontuacao.SIXTH){
            message = "Ufa";
        } else if (numTries == Pontuacao.OVER){
            message = "A palavra era: ";

        return message;
    }
}