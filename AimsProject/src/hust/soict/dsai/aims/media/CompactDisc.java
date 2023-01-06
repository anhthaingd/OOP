package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.disc.Disc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }

    public CompactDisc() {

    }



//    public CompactDisc(int id, String title, String category, float cost, String artist) {
//        super(id, title, category, cost);
//        this.artist = artist;
//    }

    public void addTrack(Track t) {
        if (tracks.contains(t)) {
            System.out.println("The track is already in the CD");
            return;
        }
        tracks.add(t);
        System.out.println("Track has been added");
    }

    public void removeTrack(Track t) {
        for (Track i : tracks) {
            if (!i.equals(t)) {
                tracks.remove(i);
                return;
            }
        }
    }

    public int getLength() {
        int sum = 0;
        for (Track t : tracks) {
            sum += t.getLength();
        }

        System.out.println("Length of the CD: " + sum);
        return sum;
    }




    public void trackArray() {
        for (int i = 0; i < tracks.size(); i++) {
            tracks.get(i).play();
        }
    }

    public void play() {
        JDialog jDialog = new JDialog();
        jDialog.setAlwaysOnTop(true);
        jDialog.setSize(400, 300);
        jDialog.setLayout(new GridLayout(3, 1));
        JLabel jLabel = new JLabel("Playing DVD: " + this.getTitle());
        JLabel jLabel1 = new JLabel("DVD length: " + this.getLength());
        jDialog.add(jLabel);
        jDialog.add(jLabel1);
        JButton button = new JButton("OK");
        jDialog.add(button);
        jDialog.setLocationRelativeTo(null);
        jDialog.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jDialog.setVisible(false);
            }
        });
    }

    @Override
    public String toString() {
        String string = "CD - ";
        string += "[";
        string += getTitle();
        string += "] - [";
        string += getCategory();
        string += "] - [";
        string += getCost();
        string += "$]   track: ";
        int i = 0;
        for (Track track : tracks) {
            if (i != 0) {
                string += ", ";
            }
            string += track.getTitle();
            i++;
        }
        return string;
    }
}
