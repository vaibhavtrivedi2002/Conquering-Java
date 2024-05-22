public class split{

    public static void main(String[] args) {
        String sentence = "Java string split method example";
        String[] words = sentence.split(" "); // Split by whitespace

        System.out.println("Original sentence: " + sentence);
        System.out.println("Words after splitting:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
