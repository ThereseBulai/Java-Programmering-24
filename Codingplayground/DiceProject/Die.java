package Codingplayground.DiceProject;

import java.util.Random; //måste använda klassen Random för detta... huh! vad menas?

public class Die {
    public int dieSides;
    public int dieRandomRoll;

    // konstruktor antal sidor
    public Die(int dieSides) {
       this.dieSides = dieSides;
    }

    // getter för konstruktorn
    public int getdieSides() {
        return dieSides;
    }

    // metod för nuvarande värde, men ska nog bytas ut till metoden längst ner, ällä?
    public int roll() {
        int dieRandomRoll = 1;
        return dieRandomRoll;
    }

    // getter för metoden
    public int getdieRandomRoll() {
    return dieRandomRoll;
    }

    //nedan för är metoden för att returnera ett slumpmässigt heltal
    public int nextInt(int maxValue){
        return dieRandomRoll;
    }

}
