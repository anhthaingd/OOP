package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<>();

    public Book() {
    }

    public Book(int id, String title, String category, float cost) {
        super(id,title,category,cost);
    }



    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author exists!!!");
        } else {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author not exixts");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id= " + getId() +
                 ", title= "+ getTitle()+
                ", category= "+ getCategory()+
                ", cost= " + getCost() +
                ", authors=" + authors +
                '}';
    }

    public static void main(String[] args) {
        Book b = new Book(1,"hi","hi",3.5f);
        b.addAuthor("Duc Ngu");
        b.addAuthor("Thai dep trai");
        System.out.println(b);
        b.removeAuthor("Duc Ngu");
        System.out.println(b);
        Cart c = new Cart();
        c.addMedia(b);
        System.out.println(c);
    }
}
