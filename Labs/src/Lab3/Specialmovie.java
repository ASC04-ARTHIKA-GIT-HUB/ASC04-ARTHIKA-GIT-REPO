package Lab3;

public class Specialmovie extends Film{

        String soundEffectsTechnology;
        String visualEffectsTechnology;

        public Specialmovie(String movieName, String producedBy, String soundEffectsTechnology, String visualEffectsTechnology) {
            super(movieName, producedBy);
            this.soundEffectsTechnology = soundEffectsTechnology;
            this.visualEffectsTechnology = visualEffectsTechnology;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Sound Effects Technology: " + soundEffectsTechnology);
            System.out.println("Visual Effects Technology: " + visualEffectsTechnology);
        }
    }


