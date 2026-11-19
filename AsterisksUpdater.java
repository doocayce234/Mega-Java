public class AsterisksUpdater {

    /**
     * Updates a string of asterisks to reveal the correct guesses.
     * @param mysteryWord the word to guess
     * @param asterisks the string of asterisks to update
     * @param guess the letter to check for
     * @return the updated string of asterisks
     */
    public static String updateAsterisks(String mysteryWord, String asterisks, String guess) {
        StringBuilder updatedAsterisks = new StringBuilder();
        for (int i = 0; i < mysteryWord.length(); i++) {
            if (mysteryWord.charAt(i) == guess.charAt(0)) {
                updatedAsterisks.append(guess.charAt(0));
            } else {
                updatedAsterisks.append(asterisks.charAt(i));
            }
        }
        return updatedAsterisks.toString();
    }
}