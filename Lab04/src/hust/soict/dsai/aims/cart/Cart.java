package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int index = 0;
    private List<Media> itemsOrder = new ArrayList<Media>();

    public void addMedia(Media media){
        if (itemsOrder.size()<MAX_NUMBERS_ORDERED) {
            itemsOrder.add(media);
            System.out.println("Add media successfully");
        } else {
            System.out.println("Full");
        }
    }

    public void removeMedia(Media media) {
        if(itemsOrder.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        if(itemsOrder.remove(media)) {
            System.out.println("Remove successfully");
        } else {
            System.out.println("Not Exists");
        }
    }

    public float totalCost(){
        if (itemsOrder.size()==0) {
            return 0;
        }
        float totalCost = 0;
        for (Media media : itemsOrder) {
            totalCost+=media.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "index=" + index +
                ", itemsOrder=" + itemsOrder +
                '}';
    }
}