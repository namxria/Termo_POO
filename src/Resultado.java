public class Resultado {
    public String showResult(int quantTentativas){
        String message = "";
        if (quantTentativas == 6){
            message = "Perfeito! Você acertou de primeira!";
        } else if (quantTentativas == 5){
            message = "Excelente! Você acertou!";
        } else if (quantTentativas == 4){
            message = "Incrível! Você acertou!";
        } else if (quantTentativas == 3){
            message = "Ótimo! Você acertou!";
        } else if (quantTentativas == 2){
            message = "Bom! Você acertou!";
        } else if (quantTentativas == 1){
            message = "Ufa, essa foi quase! Você acertou!";
        } else if (quantTentativas == 0) {
            message = "Que pena! Você perdeu!";
        }
        return message;
    }
}