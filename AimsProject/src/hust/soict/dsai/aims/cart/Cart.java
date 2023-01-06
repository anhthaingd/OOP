package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int index = 0;
    private ObservableList<Media> itemsOrder = FXCollections.observableArrayList();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByCostTitle();
    public void addMedia(Media media){
        if (itemsOrder.size()<MAX_NUMBERS_ORDERED) {
            itemsOrder.add(media);
            System.out.println("Add media successfully");
        } else {
            System.out.println("Full");
        }
    }

    public int getIndex() {
        return index;
    }

    public ObservableList<Media> getItemsOrder() {
        return itemsOrder;
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
    public Media searchByTitle(String title) {
        for(int i=0;i<itemsOrder.size();i++) {
            if(title.equals(itemsOrder.get(i).getTitle())) {
                return itemsOrder.get(i);
            }
        }
        return null;
    }

    public void emptyCart() {
        itemsOrder.clear();
    }

    public ObservableList<Media> filteredById(String Id) {
        if(Id.equals("")) return null;
        int id = Integer.parseInt(Id);
        ObservableList<Media> filteredItems =
                FXCollections.observableArrayList();
        for(int i=0;i<itemsOrder.size();i++) {
            if(id==itemsOrder.get(i).getId()) {
                filteredItems.add(itemsOrder.get(i));
            }
        }
        return filteredItems;
    }

    public ObservableList<Media> filteredByTitle(String Id) {
        ObservableList<Media> filteredItems =
                FXCollections.observableArrayList();
        if(Id.equals("")) return itemsOrder;
        for(int i=0;i<itemsOrder.size();i++) {
            if(itemsOrder.get(i).getTitle().contains(Id)) {
                filteredItems.add(itemsOrder.get(i));
            }
        }
        return filteredItems;
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

    public void print() {
        System.out.println("***********************CART***********************");
        for(int i=0;i<itemsOrder.size();i++) {
            System.out.println(itemsOrder.get(i));
        }
        System.out.println("Total cost: "+ this.totalCost()+"$");
        System.out.println("***************************************************");
    }
    public void printNoBook() {
        for (Media media : itemsOrder) {
            if (!(media instanceof Book)) {
                System.out.println(media);
            }
        }
    }

    public void filterById(int id) {
        for (Media media:itemsOrder) {
            if (media.getId()==id) {
                System.out.println(media);
            }
        }
    }

    public void filterByTitle(String input) {
        for (Media media:itemsOrder) {
            if (media.getTitle().equals(input)) {
                System.out.println(media);
            }
        }
    }
    public void sortByTitle() {
        Collections.sort(itemsOrder,Media.COMPARE_BY_COST_TITLE);
    }

    public void sortByCost() {
        Collections.sort(itemsOrder,Media.COMPARE_BY_TITLE_COST);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "index=" + index +
                ", itemsOrder=" + itemsOrder +
                '}';
    }

    public static void main(String[] args) {

        Cart cart = new Cart();
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
        cart.addMedia(dvd3);
        cart.addMedia(book1);
        System.out.println(cart);
        cart.sortByTitle();
        System.out.println("Sort by title");
        System.out.println(cart);
        System.out.println("Sort by cost");
        cart.sortByCost();
        System.out.println(cart);
        System.out.println("Print no book");
        cart.printNoBook();
    }
}