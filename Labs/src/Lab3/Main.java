package Lab3;

public class Main {

        public static void main(String[] args) {
            Specialmovie sm = new Specialmovie("Action Blast", "ABC Studios", "Dolby Atmos", "CGI");
            Internationalmovie im = new Internationalmovie("Global Hit", "XYZ Productions", "France", "French");

            sm.display();
            System.out.println();
            im.display();
        }
    }

