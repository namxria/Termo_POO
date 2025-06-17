public class Resultado implements Pontuacao {
    public String showResult(Pontuacao numTries){
        String message = "";
        if (numTries == Pontuacao.FIRST){
            message = "Perfeito!";
        } else if (numTries == Pontuacao.SECOND){
            message = "Excelente!";
        } else if (numTries == Pontuacao.THIRD){
            message = "Incrível!";
        } else if (numTries == Pontuacao.FORTH){
            message = "Ótimo!";
        } else if (numTries == Pontuacao.FIFTH){
            message = "Bom!";
        } else if (numTries == Pontuacao.SIXTH){
            message = "Ufa!";
        } else if (numTries == Pontuacao.OVER){
            message = "Que pena!";

        return message;
    }
}