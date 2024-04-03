package model;
import java.awt.*;

public class Obdelnik extends Utvar{

    private int vyska;
    private int sirka;

    @Override
    public void vykreslit(Graphics2D g){
        g.setColor(getBarva());
        if(isVypln()){
            g.fillRect(getBod().getX(), getBod().getY(), sirka, vyska);
        }
        else {
            g.drawRect(getBod().getX(), getBod().getY(), sirka, vyska);
        }
    }

    public Obdelnik(int x, int y, int sirka, int vyska, Color barva, boolean vypln){
        super(new Bod(x, y), barva, vypln);
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public int getSirka() {
        return sirka;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }


    public int getVyska() {
        return vyska;
    }


    @Override
    public String toString(){
        return "Obdelník: " +getBod() + " " + sirka + " x," + vyska + " y";
    }
}
