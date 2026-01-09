package Multimedia.java;

public enum AudOpt {
    Audio1(10, 3),
    Audio2(10, 2),
    Audio3(12, 2),
    Audio4(3, 1),
    Audio5(18, 1);

    private int durata;
    private int volume;

    AudOpt(int durata, int volume) {
        this.durata = durata;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }
}
