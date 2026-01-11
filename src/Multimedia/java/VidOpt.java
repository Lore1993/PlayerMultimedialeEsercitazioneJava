package Multimedia.java;

public enum VidOpt {
    Video1("Video1", 8, 3, 3),
    Video2("Video2", 5, 3, 2),
    video3("Video3", 10, 2, 3),
    Video4("Video4", 5, 4, 3),
    Video5("Video5", 10, 3, 5),
    ;


    private String titolo;
    private int durata;
    private int volume;
    private int luminosita;

    //costruttore
    VidOpt(String titolo, int durata, int volume, int luminosita) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;

    }

    //GET/SET
    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 5) {
            this.volume = 5;
            System.out.println("VolumeMax");
        } else if (volume < 0) {
            this.volume = 0;
            System.out.println("VolumeMin");
        } else {
            this.volume = volume;
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        if (luminosita > 5) {
            this.luminosita = 5;
            System.out.println("luminositàMax");
        } else if (luminosita < 0) {
            this.luminosita = 0;
            System.out.println("LuminositàMin");
        } else {
            this.luminosita = luminosita;
        }
    }
}

