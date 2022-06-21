public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int x = Integer.parseInt(number.trim());

                if (x < 0)
                    throw new IllegalArgumentException("n="+x+" < 0");
                if (x >= 1000)
                    continue;

                returnValue += x;
            }
        }
        return returnValue;
    }
}
