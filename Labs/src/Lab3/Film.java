package Lab3;

public class Film {

        String movieName;
        String producedBy;

        public Film(String movieName, String producedBy) {
            this.movieName = movieName;
            this.producedBy = producedBy;
        }

        public void display() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Produced By: " + producedBy);
        }
    }






