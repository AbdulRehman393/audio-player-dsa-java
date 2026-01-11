package newpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AudioPlayerFrame extends JFrame {
    private PlayList playlist;
    private JButton playButton, pauseButton, stopButton, nextButton, addButton, removeButton, showButton;
    private JTextField trackField;

    public AudioPlayerFrame() {
        playlist = new PlayList();
        initComponents();
    }

    private void initComponents() {
        setTitle("Audio Player");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.BLACK); 
        trackField = new JTextField(30);
       
        addButton = new JButton("Add Track");
        addButton.setFocusable(false);
        removeButton = new JButton("Remove Track");
        removeButton.setFocusable(false);
        playButton = new JButton("Play");
        playButton.setFocusable(false);
        pauseButton = new JButton("Pause");
        pauseButton.setFocusable(false);
        stopButton = new JButton("Stop");
        stopButton.setFocusable(false);
        nextButton = new JButton("Next");
        nextButton.setFocusable(false);
        showButton = new JButton("Show Tracks");
        showButton.setFocusable(false);
        add(trackField);
        add(addButton);
        add(removeButton);
        add(playButton);
        add(pauseButton);
        add(stopButton);
        add(nextButton);
        add(showButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String track = trackField.getText();
                playlist.addTrack(track);
                trackField.setText("");
                JOptionPane.showMessageDialog(AudioPlayerFrame.this, "Track added: " + track);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String track = trackField.getText();
                playlist.removeTrack(track);
                trackField.setText("");
                JOptionPane.showMessageDialog(AudioPlayerFrame.this, "Track removed: " + track);
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String track = playlist.getNextTrack();
                if (track != null) {
                    JOptionPane.showMessageDialog(AudioPlayerFrame.this, "Playing track: " + track);
                } else {
                    JOptionPane.showMessageDialog(AudioPlayerFrame.this, "No track to play.");
                }
            }
        });

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AudioPlayerFrame.this, "Paused.");
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AudioPlayerFrame.this, "Stopped.");
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playlist.playNextTrack();
                String track = playlist.getNextTrack();
                if (track != null) {
                    JOptionPane.showMessageDialog(AudioPlayerFrame.this, "Next track: " + track);
                } else {
                    JOptionPane.showMessageDialog(AudioPlayerFrame.this, "No more tracks.");
                }
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> tracks = playlist.getAllTracks();
                if (!tracks.isEmpty()) {
                    JOptionPane.showMessageDialog(AudioPlayerFrame.this, "Available tracks:\n" + String.join("\n", tracks));
                } else {
                    JOptionPane.showMessageDialog(AudioPlayerFrame.this, "No tracks available.");
                }
            }
        });
    }
}
