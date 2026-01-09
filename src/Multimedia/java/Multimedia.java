package Multimedia.java;

public abstract class Multimedia {
    protected int durata;

    //costruttore
    public Multimedia(int durata) {
        this.durata = durata;
    }

    //metodo
    public abstract void play();
}
