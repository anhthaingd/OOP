package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitalVideoDisc extends Disc implements Playable {

    @Override
    public void play() {
        JDialog jDialog = new JDialog();
        jDialog.setAlwaysOnTop(true);
        jDialog.setSize(400, 300);
        jDialog.setLayout(new GridLayout(3, 1));
        JLabel jLabel1 = new JLabel("Playing DVD: " + this.getTitle());
        JLabel jLabel2 = new JLabel("DVD length: " + this.getLength());
        jDialog.add(jLabel1);
        jDialog.add(jLabel2);
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


    public DigitalVideoDisc(String title, String category, float cost) {
        super(title,category,cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category,cost,director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost,director,length);

    }

    @Override
    public String toString() {
        return "DVD - [" + this.getTitle() + "] - [" + this.getCategory() + "] - [" + this.getDirector() + "] - ["
                + this.getLength() + "] [" + this.getCost() + "$]";
    }
}