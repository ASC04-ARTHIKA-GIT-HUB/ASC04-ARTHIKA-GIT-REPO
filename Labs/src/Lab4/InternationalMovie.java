package Lab4;

public class InternationalMovie extends Movie{
    String language;
    String country;

    public InternationalMovie(String title, int duration, String language, String country) {
        super(title, duration);
        this.language = language;
        this.country = country;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Language: " + language);
        System.out.println("Country: " + country);
    }

    public void showOrigin() {
        System.out.println("Origin: " + language + " - " + country);
    }
}
