/**
 * AllSubstringsOfString
 */
public class AllSubstringsOfString {
    public static void main(String[] args) {
        String s = "coding";
        int totalCount = 0;
        System.err.println("Printing all the substrings of a string");
        for (int startingIndex = 0; startingIndex < s.length(); startingIndex++) {
            for (int endingIndex = startingIndex; endingIndex < s.length(); endingIndex++) {
                for (int i = startingIndex; i <= endingIndex; i++) {
                    System.err.print(s.charAt(i));
                }
                totalCount++;
                System.err.println();
            }
        }
        System.err.println("Total Substrings count " + totalCount);
    }

}