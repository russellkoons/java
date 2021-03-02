import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber <= 0) return false;
        Song song = songs.get(trackNumber-1);
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = this.songs.findSong(title);
        if(song == null) return false;
        playlist.add(song);
        return true;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }


        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
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

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index > 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}