package org.example;
import model.SeznamUtvaru;
import model.Utvar;

import javax.swing.*;

public class Gui extends JFrame {

    private SeznamUtvaru seznamUtvaru;

    private JToolBar nastrojPanelu;
    private JList<Utvar> lstSeznamUtvaru;

    public Gui() {
        vytvoreniNabidky();
        inicializaceKomponent();
        seznamUtvaru = new SeznamUtvaru();
    }

    private void inicializaceKomponent() {

    }

    private void vytvoreniNabidky() {
        JMenuBar nabidka = new JMenuBar();
        JMenu mnSoubor = new JMenu("Soubor");

    }

    public static void main(String[] args) {
        Gui okno = new Gui();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setSize(600, 400);
        okno.setLocationRelativeTo(null);
    }

}