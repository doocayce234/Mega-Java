public class AsterisksGenerator {

    /**
     * Generates a string of asterisks of a given length.
     * @param length the number of asterisks to generate
     * @return a string of asterisks of the given length
     */
    public static String generateAsterisks(int length) {
        StringBuilder asterisks = new StringBuilder();
        for (int i = 0; i < length; i++) {
            asterisks.append("*");
        }
        return asterisks.toString();
    }
}