package hust.soict.dsai.aims;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();
        List<Media> medias = new ArrayList<Media>();
        CompactDisc cd = new CompactDisc(1,"a","b",10.5f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("a","a","b",10.5f);
        Book book = new Book(1,"a","b",10.5f);
        medias.add(cd);
        medias.add(dvd);
        medias.add(book);
        for (Media media:medias) {
            System.out.println(media.toString());
        }
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King",
                "Animation",
                "Roger Alllers",
                87,
                19.95f
        );
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars",
                "Science Fiction",
                "George Lucas",
                87,
                24.95f
        );
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladin",
                "Animation",
                18.99f
        );
        Book book1 = new Book(
                1,
                "Sun Tzu: Art of War",
                "Strategy",
                14.95f
        );
        CompactDisc cd1 = new CompactDisc(
                1,
                "Vo Tac Thien",
                "hi",
                100,
                "Loc"
        );
        store.addMedia(dvd1, dvd2, dvd3, book1, cd1);
        new StoreScreen(store);
    }
}
