
import java.util.HashMap;

public class OOPSBannerApp8 {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for O
        charMap.put('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        // Pattern for P
        charMap.put('P', new String[]{
            "***** ",
            "**   **",
            "**   **",
            "***** ",
            "**    ",
            "**    ",
            "**    "
        });

        // Pattern for S
        charMap.put('S', new String[]{
            "   ****  ",
            " **      ",
            "**       ",
            "  ****   ",
            "      ** ",
            "     **  ",
            " *****   "
        });

        return charMap;
    }

    // Method to display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
