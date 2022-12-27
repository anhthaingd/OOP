package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return this.artist;
    }
    public CompactDisc() {

    }

    public CompactDisc(int id,String title,String category,float cost)  {
        super(id,title,category,cost);
    }
    public CompactDisc(int id,String title,String category,float cost,String artist) {
        super(id,title,category,cost);
        this.artist = artist;
    }
    public void addTrack(Track t) {
        for (Track i : tracks) {
            if (!i.equals(t)) {
                System.out.println("Track exists");
                return ;
            }
        }
        tracks.add(t);
    }

    public void removeTrack(Track t) {
        for (Track i : tracks) {
            if (!i.equals(t)) {
                tracks.remove(i);
                return;
            }
        }
    }
    public void getLength() {
        int sum=0;
        for (Track t : tracks) {
            sum += t.getLength();
        }
        System.out.println("Length of the CD: " + sum);
    }
    @Override
    public String toString() {
        return "CompactDisc{" +
                "id= "+getId()+
                ", title= " + getTitle() +
                ", category= " + getCategory() +
                ", cost= " + getCost() +
                ", artist= " + this.artist +
                ", tracks= " + tracks +
                "}";
    }

    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc(1,"hi","hi",3.6f,"Thai");
        cd.getLength();
        System.out.println(cd);
        Track t = new Track("Duc dan",5);
        Track t1 = new Track("Duc dan",5);
        cd.addTrack(t);
        cd.addTrack(t1);
        cd.getLength();

        System.out.println(cd);
        System.out.println(cd);
        System.out.println("Track of the arraylist");
        cd.trackArray();
        System.out.println("Some information about the CompactDisc");
        cd.play();
    }

    public void trackArray() {
        for(int i = 0; i < tracks.size();i++) {
            tracks.get(i).play();
        }
    }
    @Override
    public void play() {
        System.out.println("{CompactDisc: " +
                "id= "+getId()+
                ", title= " + getTitle() +
                ", category= " + getCategory() +
                ", cost= " + getCost() +
                ", artist= " + this.artist +
                ", tracks= " + tracks +
                "}");

    }
}
