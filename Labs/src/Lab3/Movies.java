package Lab3;

import java.util.Scanner;

public class Movies {

        String movieName;
        String producedBy;
        String directedBy;
        int duration;
        int year;
        String category;

        static int moviesCount = 0;

        public Movies(String movieName, String producedBy) {
            this.movieName = movieName;
            this.producedBy = producedBy;
            moviesCount++;
        }

        public Movies(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
            this(movieName, producedBy);
            this.directedBy = directedBy;
            this.duration = duration;
            this.year = year;
            this.category = category;
        }

        public void acceptDetails(Scanner sc) {
            System.out.print("Enter Director: ");
            directedBy = sc.nextLine();

            System.out.print("Enter Duration: ");
            duration = sc.nextInt();

            System.out.print("Enter Year: ");
            year = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Category: ");
            category = sc.nextLine();
        }

        public void displayDetails() {
            System.out.println("Movie Details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Produced By: " + producedBy);
            System.out.println("Directed By: " + directedBy);
            System.out.println("Duration: " + duration + " minutes");
            System.out.println("Year: " + year);
            System.out.println("Category: " + category);
        }

        public static int getMoviesCount() {
            return moviesCount;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Movie m1 = new Movie("Interstellar", "Emma Thomas");
            m1.acceptDetails(sc);
            m1.displayDetails();

            System.out.println();

            Movie m = new Movie("Hello", "XYZ Productions");
            System.out.println(m.getMovieId());






        }
    }


