package Lab1;

public class StringMethodsDemo {

    public void testCharAt(String str) {
        System.out.println("charAt(2): " + str.charAt(2));
    }

    public void testContains(String str) {
        System.out.println("contains(\"Java\"): " + str.contains("Java"));
    }

    public void testLength(String str) {
        System.out.println("length: " + str.length());
    }

    public void testIndexOf(String str) {
        System.out.println("indexOf('a'): " + str.indexOf('a'));
    }

    public void testEquals(String str1, String str2) {
        System.out.println("equals: " + str1.equals(str2));
    }

    public void testEqualsIgnoreCase(String str1, String str2) {
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
    }

    public void testJoin() {
        String result = String.join("-", "Java", "is", "fun");
        System.out.println("join: " + result);
    }

    public void testLastIndexOf(String str) {
        System.out.println("lastIndexOf('a'): " + str.lastIndexOf('a'));
    }

    public void testSubstring(String str) {
        System.out.println("substring(5, 9): " + str.substring(5, 9));
    }

    public void testToLowerCase(String str) {
        System.out.println("toLowerCase: " + str.toLowerCase());
    }

    public void testToUpperCase(String str) {
        System.out.println("toUpperCase: " + str.toUpperCase());
    }

    public void testTrim(String str) {
        System.out.println("trim: \"" + str.trim() + "\"");
    }

    public static void main(String[] args) {
        StringMethodsDemo demo = new StringMethodsDemo();

        String str = "  Hello Java World  ";
        String str1 = "Java";
        String str2 = "java";

        System.out.println("Original String: \"" + str + "\"\n");

        demo.testCharAt(str.trim());
        demo.testContains(str);
        demo.testLength(str);
        demo.testIndexOf(str);
        demo.testEquals(str1, str2);
        demo.testEqualsIgnoreCase(str1, str2);
        demo.testJoin();
        demo.testLastIndexOf(str);
        demo.testSubstring(str.trim());
        demo.testToLowerCase(str);
        demo.testToUpperCase(str);
        demo.testTrim(str);
    }
}
