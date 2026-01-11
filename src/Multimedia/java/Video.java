package Multimedia.java;

import java.util.Scanner;

public class Video extends Multimedia {
    Scanner sc = new Scanner(System.in);


    public void alzailVolume(VidOpt video) {
        if (video.getVolume() < 5) {
            System.out.println("Alza il volume, premi un numero fino a 5");
        } else {
            System.out.println("Il volume è già al massimo, scrivi 5 per continuare");
        }
        String volumeSel = sc.nextLine();
        video.setVolume(Integer.parseInt(volumeSel));

    }

    public void abbassailVolume(VidOpt video) {
        if (video.getVolume() > 0) {
            System.out.println("Se vuoi puoi abbassare il volume, premi un numero fino a 0");
        } else {
            System.out.println("Il volume è già al minimmo, scrivi 0 per continuare");
        }
        String volumeSel = sc.nextLine();
        video.setVolume(Integer.parseInt(volumeSel));

    }

    public void alzaLuce(VidOpt video) {
        if (video.getLuminosita() < 5) {
            System.out.println("Aumenta luminosità, premi un numero fino a 5");
        } else {
            System.out.println("Luminosità al massimo, scrivi 5 per continuare");
        }
        String lumeSel = sc.nextLine();
        video.setLuminosita(Integer.parseInt(lumeSel));

    }

    public void abbassaLuce(VidOpt video) {
        if (video.getLuminosita() > 0) {
            System.out.println("Se vuoi puoi abbassare abbassare la luminosità fino a 0");
        } else {
            System.out.println("Luminosità già al minimmo, scrivi 0 per continuare");
        }
        String lumeSel = sc.nextLine();
        video.setLuminosita(Integer.parseInt(lumeSel));

    }

    @Override
    public void play() {

    }

    @Override
    public void play(AudOpt audio) {

    }

    @Override
    public void play(VidOpt video) {
        for (int i = 0; i < video.getDurata(); i++) {
            System.out.print(video.getTitolo() + " -> ");

            // Stampa volume (!)
            for (int j = 0; j < video.getVolume(); j++) {
                System.out.print("!");
            }

            // Stampa luminosità (*)
            for (int x = 0; x < video.getLuminosita(); x++) {
                System.out.print("*");
            }

            System.out.println();  // Va a capo
        }
    }

    @Override
    public void show(ImgOpt img) {

    }

    
}
