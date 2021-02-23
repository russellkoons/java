import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song found = findSong(title);

        if (found == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public boolean addToPlaylist(int track, LinkedList<Song> playlist) {
        Song song = songs.get(track - 1);
        String songTitle = song.getTitle();

        ListIterator<Song> playlistIterator = playlist.listIterator();

        while (playlistIterator.hasNext()) {
            if (playlistIterator.next().getTitle().compareTo(songTitle) == 0) {
                return false;
            }
        }

        playlist.add(song);
        return true;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);

        if (song == null) {
            return false;
        }

        ListIterator<Song> playlistIterator = playlist.listIterator();

        while (playlistIterator.hasNext()) {
            if (playlistIterator.next().getTitle().compareTo(title) == 0) {
                return false;
            }
        }

        playlist.add(song);
        return true;
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
}
