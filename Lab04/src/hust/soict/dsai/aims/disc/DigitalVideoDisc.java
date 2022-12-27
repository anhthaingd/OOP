package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable {

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }


    public DigitalVideoDisc(String title, String category, float cost) {
        super(title,category,cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category,cost,director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost,director,length);

    }
}