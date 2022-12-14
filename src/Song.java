package src;

public class Song {
    private String title;
    private double duration;

    // constructor
    public Song(String title, double duration){
        this.title=title;
        this.duration=duration;
    }

    public String getTitle() {
        return title;
    }
    public double getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    //For printing
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
