package oop.example.Ex33.base;

public class BallGameMessage {
    public String message(int random) {
        if (random==1 ){
            return "Yes.";
        }else if (random==2){
            return "No.";
        }else if (random == 3){
           return "Maybe.";
        }else{
            return "Ask again later.";
        }

    }
}
