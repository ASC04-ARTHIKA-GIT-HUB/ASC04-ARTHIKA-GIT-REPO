package Lab3;

public class Internationalmovie extends Film{

        String country;
        String language;

        public Internationalmovie(String movieName, String producedBy, String country, String language) {
            super(movieName, producedBy);
            this.country = country;
            this.language = language;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Country: " + country);
            System.out.println("Language: " + language);
        }
    }


