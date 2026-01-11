package Multimedia.java;

import java.util.Scanner;

public class Img extends Multimedia {
    Scanner sc = new Scanner(System.in);

    public void alzaLaLuce(ImgOpt Img) {
        if (Img.getLuminosita() < 5) {
            System.out.println("Aumenta luminosità, premi un numero fino a 5");
        } else {
            System.out.println("Luminosità al massimo, scrivi 5 per continuare");
        }
        String lumeSel = sc.nextLine();
        Img.setLuminosita(Integer.parseInt(lumeSel));

    }

    public void abbassaLaLuce(ImgOpt Img) {
        if (Img.getLuminosita() > 0) {
            System.out.println("Se vuoi puoi abbassare abbassare la luminosità fino a 0");
        } else {
            System.out.println("Luminosità già al minimmo, scrivi 0 per continuare");
        }
        String lumeSel = sc.nextLine();
        Img.setLuminosita(Integer.parseInt(lumeSel));

    }

    @Override
    public void play() {

    }

    @Override
    public void play(AudOpt audio) {

    }

    @Override
    public void play(VidOpt video) {

    }

    @Override
    public void show(ImgOpt img) {
        for (int i = 0; i < img.getDurata(); i++) {
            System.out.print(img.getTitolo() + " -> ");

            // Stampa luminosità (*)
            for (int x = 0; x < img.getLuminosita(); x++) {
                System.out.print("*");
            }

            System.out.println();  // Va a capo
        }

    }
}
