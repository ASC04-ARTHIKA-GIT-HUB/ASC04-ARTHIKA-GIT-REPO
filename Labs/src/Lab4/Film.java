package Lab4;

public class Film {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new Movie("Generic Movie", 120);
        movies[1] = new SpecialMovie("Director's Cut", 150, "Behind the Scenes");
        movies[2] = new InternationalMovie("La Vita è Bella", 116, "Italian", "Italy");

        for (Movie m : movies) {
            m.showDetails();

            if (m instanceof SpecialMovie) {
                ((SpecialMovie) m).showSpecialFeature();
            } else if (m instanceof InternationalMovie) {
                ((InternationalMovie) m).showOrigin();
            }
        }
    }
}
