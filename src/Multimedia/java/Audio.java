package Multimedia.java;

import java.util.Scanner;

public class Audio extends Multimedia {
    Scanner sc = new Scanner(System.in);
    private int volume;

    //costruttore
    public Audio() {
        super();

    }

    @Override
    public void play() {

    }


    public void alzaVolume(AudOpt audio) {
        if (audio.getVolume() < 5) {
            System.out.println("Se vuoi puoi alzare il volume fino a 5");
        } else {
            System.out.println("Il volume è già al massimo, scrivi 5 per continuare");
        }
        String volumeSel = sc.nextLine();
        audio.setVolume(Integer.parseInt(volumeSel));

    }

    public void abbassaVolume(AudOpt audio) {
        if (audio.getVolume() < 0) {
            System.out.println("Se vuoi puoi abbassare il volume fino a 0");
        } else {
            System.out.println("Il volume è già al minimmo, scrivi 0 per continuare");
        }
        String volumeSel = sc.nextLine();
        audio.setVolume(Integer.parseInt(volumeSel));

    }


    @Override
    public void play(AudOpt audio) {
        for (int i = 0; i < audio.getDurata(); i++) {
            System.out.print(audio.getTitolo() + " -> ");

            for (int j = 0; j < audio.getVolume(); j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}
