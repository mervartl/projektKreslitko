package model;

public class Bod {
    private int x;
    private int y;

    public Bod(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Bod()
    {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }


    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }


    @Override
    public String toString()
    {
        return '[' + x + "; " + y + ']';
    }
}
