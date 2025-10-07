package exceptions;

public class handledexception {
        public handledexception() {
            res = 0;
        }

        int res;
        private void test () {
            try {
                int i = 100;
                System.out.println("divide by zero");
                res = i / 0;
            } catch (Exception exception) {
                System.out.println("Exception occured: " + exception);
            }

            System.out.println("abruptly terminated, so this does not execute");
            System.out.println(res);
        }
    public static void main(String[] args) {
        handledexception  hd=new handledexception();
        hd.test();

    }
}