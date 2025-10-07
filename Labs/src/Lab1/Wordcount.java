package Lab1;

public class Wordcount {

        public int countWords(String input) {
            String[] words = input.trim().split("\\s+");
            return words.length;
        }

        public static void main(String[] args) {
            Wordcount wc = new Wordcount();
            String input = "Sum of 12 and 20 is 32";
            int count = wc.countWords(input);
            System.out.println("Number of words: " + count);
        }
    }


