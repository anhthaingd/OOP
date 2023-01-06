package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Media extends Object{
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int currentId = 0;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media() {

    }
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category= category;
        this.cost = cost;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public int getCurrentId() {
        return currentId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        return this.title.equals(((Media)obj).getTitle());
    }
    public void play() {

    }

    public static void main(String[] args) {
        List<Media> media = new ArrayList<Media>();


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
        media.add(dvd3);
        media.add(book1);
        for(Media m:media) {
            System.out.println(m.toString());
        }
    }
}
