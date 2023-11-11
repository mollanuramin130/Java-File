public class ReverseWords {
    public static void main(String[] args) {
        String input = "Java is a High level language";
        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() < 4) {
                result.append("");
            } else {
                StringBuilder reversed = new StringBuilder();
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed.append(word.charAt(i));
                }
                result.append(reversed.toString()).append(" ");
            }
        }

        // Remove the trailing space and print the result
        String finalResult = result.toString().trim();
        System.out.println(finalResult);
    }
}
