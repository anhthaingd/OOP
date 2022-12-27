package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> itemsInStore;
    public Store() {
        this.itemsInStore = new ArrayList<Media>();
    }
    public void addMedia(Media ...media) {
        for (Media media1:media) {
            itemsInStore.add(media1);
        }
    }

    public void removeDVD(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Remove successfully");
        } else {
            System.out.println("Remove fails");
        }
    }
    public List<Media> getItemsInStore() {
        return itemsInStore;
    }
}
