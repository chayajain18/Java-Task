public class Program4 {
    public static void main(String[] args) {
        // String Initialization
        String str1 = "Hello, ";
        String str2 = "world!";

        // String Concatenation
        String concatenated = str1 + str2;
        System.out.println("Concatenated String: " + concatenated);

        // String Length
        int length = concatenated.length();
        System.out.println("Length of String: " + length);

        // String Comparison
        String str3 = "Hello, world!";
        boolean isEqual = concatenated.equals(str3);
        System.out.println("Are the strings equal? " + isEqual);

        // Substring Extraction
        String subString = concatenated.substring(7);
        System.out.println("Substring: " + subString);

        // String Searching
        int index = concatenated.indexOf("world");
        if (index != -1) {
            System.out.println("Index of 'world': " + index);
        } else {
            System.out.println("'world' not found.");
        }
    }
}

