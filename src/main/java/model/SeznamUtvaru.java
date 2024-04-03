package model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SeznamUtvaru extends AbstractListModel<Utvar> {
    private List<Utvar> seznam;

    public SeznamUtvaru(){
        seznam = new ArrayList<>();
    }

    public void pridejutvar(Utvar utvar) {
        seznam.add(utvar);
        int index = seznam.size() - 1;
        fireIntervalAdded(this, index, index);
    }
    public void smazUtvary(){
        int indexPoslednihoPrvku = seznam.size() - 1;
        seznam.clear();
        fireIntervalRemoved(this, indexPoslednihoPrvku, indexPoslednihoPrvku);
    }

    @Override
    public int getSize() {
        return seznam.size();
    }

    @Override
    public Utvar getElementAt(int index) {
        return seznam.get(index);
    }
}
