public class ArmstrongCheck {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result = result + (digit * digit * digit);
            number = number / 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
