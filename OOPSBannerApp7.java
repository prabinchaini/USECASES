
public class OOPSBannerApp7 {

    /**
     * Inner Static Class to encapsulate character and its pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character The character
         * @param pattern   The 7-line banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern.
         *
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a given character.
     *
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return pattern of the character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    /**
     * Utility method to print banner word.
     *
     * @param word     word to print
     * @param patterns available character patterns
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                String[] pattern = getCharacterPattern(word.charAt(i), patterns);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

                new CharacterPatternMap('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),

                new CharacterPatternMap('P', new String[]{
                        "****** ",
                        "*     *",
                        "*     *",
                        "****** ",
                        "*      ",
                        "*      ",
                        "*      "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ***** ",
                        "*     *",
                        "*      ",
                        " ***** ",
                        "      *",
                        "*     *",
                        " ***** "
                })
        };

        printBanner("OOPS", patterns);
    }
}