package newpackage;

import java.util.ArrayList;

public class PlayList {
    private LinkedList tracks;

    public PlayList() {
        tracks = new LinkedList();
    }

    
    public void addTrack(String track) {
        tracks.add(track);
    }

    public void removeTrack(String track) {
        tracks.remove(track);
    }

    public String getNextTrack() {
        return tracks.getFirst();
    }

    public void playNextTrack() {
        tracks.removeFirst();
    }

    public ArrayList<String> getAllTracks() {
        return tracks.getAllTracks();
    }
}
