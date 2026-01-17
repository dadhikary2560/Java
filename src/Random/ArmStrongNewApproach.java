package Random;

public class ArmStrongNewApproach {
    public static void main(String[] args) {

        int num = 153;
        int org = num;
        int num2 = num;
        int count = 0;

        // Count digits
        while (num > 0) {
            count++;
            num = num / 10;
        }

        int sum = 0;

        // Armstrong logic
        while (num2 > 0) {
            int digit = num2 % 10;
            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            num2 = num2 / 10;
        }

        System.out.println(sum);

        if (sum == org) {
            System.out.println("Number is an Armstrong number");
        } else {
            System.out.println("Number is NOT an Armstrong number");
        }
    }
}
