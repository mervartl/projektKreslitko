package model;
import java.awt.*;

public abstract class Utvar implements Kreslitelny {
    private Bod bod;
    private Color barva;
    private boolean vypln;

    public Utvar(Bod bod, Color barva, boolean vypln){
        this.bod = bod;
        this.barva = barva;
        this.vypln = vypln;
    }

    public Bod getBod() {
        return bod;
    }

    public void setBod(Bod bod) {
        this.bod = bod;
    }

    public java.awt.Color getBarva() {
        return barva;
    }

    public void setBarva(java.awt.Color barva) {
        this.barva = barva;
    }

    public boolean isVypln() {
        return vypln;
    }

    public void setVypln(boolean vypln) {
        this.vypln = vypln;
    }
}
