package Lab4;

public class MovieMain {
    public static void main(String[] args){
        Movie[] movies=new Movie[3];

        movies[0]=new Movie("Generic movie", 120);
        movies[1]=new SpecialMovie("Avengers:Extended", 150, "Director's Commentary");
        movies[2]=new InternationalMovie("Parasite",132,"Korean","South Korean");

        for (Movie m:movies){
            m.showDetails();
        }
    }
}
