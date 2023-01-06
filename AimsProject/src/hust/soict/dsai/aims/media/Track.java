package hust.soict.dsai.aims.media;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public Track() {

    }
    public Track(String title,int length) {
        this.title = title;
        this.length = length;
    }
    public void play() {
        JDialog jDialog = new JDialog();
        jDialog.setAlwaysOnTop(true);
        jDialog.setSize(400, 300);
        jDialog.setLayout(new FlowLayout());
        jDialog.setLocationRelativeTo(null);
        JButton button = new JButton("OK");
        jDialog.add(button);
        jDialog.setVisible(true);
        JLabel jLabel = new JLabel("Playing DVD: " + this.getTitle() + "\nDVD length: " + this.getLength());
        jDialog.add(jLabel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jDialog.setVisible(false);
            }
        });
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.title.equals(((Track)obj).getTitle()) && this.length == ((Track)obj).getLength();
    }
}
