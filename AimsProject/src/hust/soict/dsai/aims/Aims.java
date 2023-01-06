package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        List<Media> medias = new ArrayList<Media>();
        DigitalVideoDisc dvd = new DigitalVideoDisc("a","a","b",10.5f);
        Book book = new Book(3,"Book","b",10.5f);
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

        Track track1 = new Track("Thai", 1);
        Track track2 = new Track("Nguyen", 2);

        store.addMedia(dvd1, dvd2, dvd3, book1,book);
        boolean showMenu = true;
        boolean storeMenu ;
        boolean mediaDetail ;
        boolean mediaDetailBook ;
        boolean cartMenu;
        StoreScreen testScreen = new StoreScreen(store, cart);
//        while (showMenu) {
//            showMenu();
//            Scanner sc = new Scanner(System.in);
//            int choose = sc.nextInt();
//            switch (choose) {
//                case 0:
//                    showMenu = false;
//                    break;
//                case 1:
//                    storeMenu = true;
//                    while (storeMenu) {
//                        storeMenu();
//                        int store1 = sc.nextInt();
//                        switch (store1) {
//                            case 0:
//                                storeMenu = false;
//                                break;
//                            case 1:
//                                String inputString = input();
//                                mediaDetail = true;
//                                if(store.find(inputString)!=null&&!(store.find(inputString) instanceof Book)) {
//                                    while (mediaDetail) {
//                                        mediaDetailsMenu();
//                                        int media = sc.nextInt();
//                                        switch (media) {
//                                            case 0:
//                                                mediaDetail = false;
//                                                break;
//                                            case 1:
//                                                cart.addMedia(store.find(inputString));
//                                                break;
//                                            case 2:
//                                                store.find(inputString).play();
//                                                break;
//                                        }
//                                    }
//                                } else if(store.find(inputString)!=null) {
//                                    mediaDetailBook=true;
//                                    while (mediaDetailBook) {
//                                        mediaDetailsMenuForBooks();
//                                        int chooseBook = sc.nextInt();
//                                        switch (chooseBook) {
//                                            case 0:
//                                                mediaDetailBook = false;
//                                                break;
//                                            case 1:
//                                                cart.addMedia(store.find(inputString));
//                                                break;
//                                            default:
//                                                System.out.println("Choose again");
//                                                break;
//                                        }
//                                    }
//                                } else {
//                                    System.out.println("Not found media");
//                                }
//                                break;
//                            case 2:
//                                store.print();
//                                String input1 = input();
//                                if(store.find(input1)!=null) {
//                                    cart.addMedia(store.find(input1));
//                                } else {
//                                    System.out.println("Not found media");
//                                }
//                                break;
//                            case 3:
//                                store.print();
//                                String input2 = input();
//                                if (store.find(input2)!=null&&!(store.find(input2) instanceof Book)) {
//                                    store.find(input2).play();
//                                } else {
//                                    System.out.println("Not found media");
//                                }
//                                break;
//                            case 4:
//                                cart.print();
//                                break;
//                            default:
//                                System.out.println("Choose again");
//                                break;
//                        }
//                    }
//                    break;
//                case 2:
//                    store.print();
//                    System.out.println("Do you want to add(1) or remove(2) to the Store");
//                    int input3 = sc.nextInt();
//                    switch (input3) {
//                        case 1:
//                            System.out.println("add");
//                            break;
//                        case 2:
//                            String input4 = input();
//                            if (store.find(input4)!=null) {
//                                store.removeMedia(store.find(input4));
//                            } else {
//                                System.out.println("Not found media");
//                            }
//                            break;
//                        default:
//                            System.out.println("...");
//                            break;
//                    }
//                    break;
//                case 3:
//                    cartMenu = true;
//                    while (cartMenu) {
//                        cartMenu();
//                        int chooseCart = sc.nextInt();
//                        switch (chooseCart) {
//                            case 0:
//                                cartMenu = false;
//                                break;
//                            case 1:
//                                System.out.println("1: Filter by id \n2: Filter by title");
//                                int input5 = sc.nextInt();
//                                if (input5==1) {
//                                    System.out.println("Input id: ");
//                                    int input6 = sc.nextInt();
//                                    cart.filterById(input6);
//                                } else if(input5==2) {
//                                    System.out.println("Input title: ");
//                                    String input7 = sc.next();
//                                    cart.filterByTitle(input7);
//                                } else {
//                                    System.out.println("Choose wrong");
//                                }
//                                break;
//                            case 2:
//                                System.out.println("1: Sort by cost\n2: Sort by title");
//                                int inp = sc.nextInt();
//                                if (inp==1) {
//                                    cart.sortByCost();
//                                    System.out.println(cart);
//                                } else if(inp==2) {
//                                    cart.sortByTitle();
//                                    System.out.println(cart);
//                                } else {
//                                    System.out.println("Choose wrong");
//                                }
//                                break;
//                            case 3:
//                                String inpS = input();
//                                if(cart.searchByTitle(inpS)!=null) {
//                                    cart.removeMedia(cart.searchByTitle(inpS));
//                                } else {
//                                    System.out.println("Not found media");
//                                }
//                                break;
//                            case 4:
//                                cart.print();
//                                String input2 = input();
//                                if (cart.searchByTitle(input2)!=null&&!(cart.searchByTitle(input2) instanceof Book)) {
//                                    cart.searchByTitle(input2).play();
//                                } else {
//                                    System.out.println("Not found media");
//                                }
//                                break;
//                            case 5:
//                                System.out.println("An order is created and empty the current cart.");
//                                break;
//                            default:
//                                System.out.println("Choose again");
//                                break;
//                        }
//                    }
//                    break;
//                default:
//                    System.out.println("Choose again");
//                    break;
//            }
//        }
    }

    public static String input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter title: ");
        String inputString = input.next();
        return inputString;
    }
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void mediaDetailsMenuForBooks() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1");
    }
    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");

    }
}
