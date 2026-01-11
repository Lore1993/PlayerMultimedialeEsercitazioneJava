package Multimedia.java;

public enum ImgOpt {
    Immagine1("Immagine1", 1, 2),
    Immagine2("Immagine2", 1, 3),
    Immagine3("Immagine3", 1, 4),
    Immagine4("Immagine4", 1, 3),
    Immagine5("Immagine5", 1, 2),
    ;


    private String titolo;
    private int durata;
    private int luminosita;


    ImgOpt(String titolo, int durata, int luminosita) {
        this.titolo = titolo;
        this.durata = durata;
        this.luminosita = luminosita;

    }

    public String getTitolo() {
        return titolo;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int getDurata() {
        return durata;
    }
}
