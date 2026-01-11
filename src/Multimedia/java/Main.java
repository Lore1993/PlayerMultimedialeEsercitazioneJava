package Multimedia.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Audio musica = new Audio();
        Video video = new Video();
        Img immagine = new Img();
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


                musica.abbassaVolume(riprodurre);
                musica.alzaVolume(riprodurre);
                musica.play(riprodurre);
                break;
            }
            case Video: {

                System.out.println("Scegli il tuo audio preferito, scrivimi: Video+(numero da 1 a 5)");
                String videoScelto = sc.nextLine();
                VidOpt riprodurreVid = VidOpt.valueOf(videoScelto);

                video.abbassailVolume(riprodurreVid);
                video.alzailVolume(riprodurreVid);
                video.alzaLuce(riprodurreVid);
                video.abbassaLuce(riprodurreVid);
                video.play(riprodurreVid);
                break;
            }
            case Immagine: {

                System.out.println("Scegli il tuo audio preferito: Immagine+(numero da 1 a 5)");
                String immagineScelta = sc.nextLine();
                ImgOpt riprodurreImg = ImgOpt.valueOf(immagineScelta);
                //Adesso agisci poi cancella commento
                immagine.alzaLaLuce(riprodurreImg);
                immagine.abbassaLaLuce(riprodurreImg);
                immagine.show(riprodurreImg);
                break;
            }
        }
    }


}
