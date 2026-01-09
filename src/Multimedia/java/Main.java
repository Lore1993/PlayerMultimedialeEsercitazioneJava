package Multimedia.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Audio musica = new Audio();
        Scanner sc = new Scanner(System.in);

        //Scelta del media
        System.out.println("Scegli il tipo di media (Audio,Video,Immagine)");
        String tipoScelto = sc.nextLine();
        ImAuVi media = ImAuVi.valueOf(tipoScelto);

        switch (media) {
            case Audio: {

                System.out.println("Scegli il tuo audio preferito: Audio+(numero da 1 a 5)");
                String audioScelto = sc.nextLine();
                AudOpt riprodurre = AudOpt.valueOf(audioScelto);
                //Adesso agisci poi cancella commento

                musica.abbassaVolume(riprodurre);
                musica.alzaVolume(riprodurre);
                musica.play(riprodurre);
                break;
            }
            case Video: {

                System.out.println("Scegli il tuo audio preferito: Video+(numero da 1 a 5)");
                String videoScelto = sc.nextLine();
                AudOpt riprodurreVid = AudOpt.valueOf(videoScelto);
                //Adesso agisci poi cancella commento
                System.out.println("Hai scelto l'audio: " + riprodurreVid);
                break;
            }
            case Immagine: {

                System.out.println("Scegli il tuo audio preferito: Immagine+(numero da 1 a 5)");
                String immagineScelta = sc.nextLine();
                AudOpt riprodurreImg = AudOpt.valueOf(immagineScelta);
                //Adesso agisci poi cancella commento
                System.out.println("Hai scelto l'immagine: " + riprodurreImg);
                break;
            }
        }
    }

    private static void alzaVolume() {
    }
}
