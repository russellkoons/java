import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song found = findSong(title);

        if (found == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    private Song findSong(String title) {
        if (!songs.isEmpty()) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber <= 0) return false;
        Song song = songs.get(trackNumber-1);
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = findSong(title);
        if(song == null) return false;
        playlist.add(song);
        return true;
    }
}