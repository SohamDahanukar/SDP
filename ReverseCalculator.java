public class ReverseCalculator {
    public static int reverseWithWhile(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static int reverseWithFor(int number) {
        int reversedNumber = 0;
        for (char digitChar : Integer.toString(number).toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            reversedNumber = (reversedNumber * 10) + digit;
        }
        return reversedNumber;
    }

    public static int reverseWithDoWhile(int number) {
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number = number / 10;
        } while (number > 0);
        return reversedNumber;
    }

    public static void main(String[] args) {
        int inputNumber = 27;

        // Using while loop
        int resultWhile = reverseWithWhile(inputNumber);
        System.out.println("Using while loop: " + resultWhile);

        // Using for loop
        int resultFor = reverseWithFor(inputNumber);
        System.out.println("Using for loop: " + resultFor);

        // Using do-while loop
        int resultDoWhile = reverseWithDoWhile(inputNumber);
        System.out.println("Using do-while loop: " + resultDoWhile);
    }
}

