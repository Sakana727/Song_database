package sg.edu.rp.c346.id22020383.song_database;

import androidx.annotation.NonNull;

public class Song {
    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;

    public Song(int id, String title, String singers, int year, int stars) {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;
    }

    // Getters and setters...

    @NonNull
    @Override
    public String toString() {
        return title + " - " + singers + " (" + year + ")";
    }
}
