package DIO.digitalinovation.Strategy;

public class Robot {

    private Comportament comportament;

    public void setComportament(Comportament comportament) {
        this.comportament = comportament;
    }

    public void mover(){
        comportament.mover();
    }
}
