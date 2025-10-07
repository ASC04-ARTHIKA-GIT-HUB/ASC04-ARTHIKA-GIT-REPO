package Lab4;

public class SpecialMovie extends Movie{
    String specialFeature;

    public SpecialMovie(String title, int duration, String specialFeature) {
        super(title, duration);
        this.specialFeature = specialFeature;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Special Feature: " + specialFeature);
    }

    public void showSpecialFeature() {
        System.out.println("Special Feature (via method): " + specialFeature);
    }
}
