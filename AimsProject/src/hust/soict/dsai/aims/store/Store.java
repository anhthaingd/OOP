package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public ArrayList<Media> itemsInStore =
            new ArrayList<Media>();
    public Store() {
        this.itemsInStore = new ArrayList<Media>();
    }
    public void addMedia(Media ...media) {
        for (Media media1:media) {
            itemsInStore.add(media1);
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Remove successfully");
        } else {
            System.out.println("Remove fails");
        }
    }

    public Media find(String inputMedia) {
        for(Media media : itemsInStore) {
            if(media.getTitle().equals(inputMedia)) {
                return media;
            }
        }
        return null;
    }

    public void print() {
        for (Media media:itemsInStore) {
            System.out.println(media);
        }
    }
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}
