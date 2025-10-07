package Lab4;

public class Movie {
    String title;
    int duration;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}
