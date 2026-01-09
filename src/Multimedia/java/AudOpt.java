package Multimedia.java;

public enum AudOpt {
    Audio1(10, 3, "audio1"),
    Audio2(10, 2, "audio2"),
    Audio3(12, 2, "audio3"),
    Audio4(3, 1, "audio4"),
    Audio5(18, 1, "audio5");

    private String titolo;
    private int durata;
    private int volume;

    AudOpt(int durata, int volume, String titolo) {
        this.durata = durata;
        this.volume = volume;
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
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

    public int getDurata() {
        return durata;


    }
}
