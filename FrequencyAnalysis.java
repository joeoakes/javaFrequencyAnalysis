import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        Map<Character, Integer> frequencyMap = calculateCharacterFrequency(text);

        // Print the frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }

    public static Map<Character, Integer> calculateCharacterFrequency(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Convert the text to lowercase to treat uppercase and lowercase characters equally
        text = text.toLowerCase();

        // Iterate through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Ignore non-alphabetic characters
            if (Character.isLetter(c)) {
                // If the character is already in the map, increment its frequency
                // Otherwise, add it to the map with frequency 1
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        return frequencyMap;
    }
}
