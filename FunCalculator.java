public class FunCalculator {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static boolean isLucky(int number) {
        int sum = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10;

            // Only consider even positioned digits starting from the second position
            if (position % 2 == 0) {
                sum += Math.pow(digit, 2);
            }

            position++;
            number /= 10;
        }

        return sum % 9 == 0;
    }

    public static void main(String[] args) {
        int armstrongNumber = 153;
        int luckyNumber = 1623;

        // Check if a number is Armstrong
        if (isArmstrong(armstrongNumber)) {
            System.out.println(armstrongNumber + " is an Armstrong number.");
        } else {
            System.out.println(armstrongNumber + " is not an Armstrong number.");
        }

        // Check if a number is Lucky
        if (isLucky(luckyNumber)) {
            System.out.println(luckyNumber + " is a Lucky number.");
        } else {
            System.out.println(luckyNumber + " is not a Lucky number.");
        }
    }
}

