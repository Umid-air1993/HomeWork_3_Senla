import java.util.Random;

public class SubTask_1 {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        int number1 = rand1.nextInt(100, 999);
        int number2 = rand2.nextInt(100, 999);
        int number3 = rand3.nextInt(100, 999);
        System.out.println("1-random: " + number1);
        System.out.println("2-random: " + number2);
        System.out.println("3-random: " + number3);
        int sum = number1 + number2 + number3;
        System.out.println("Sum of random numbers: " + sum);
        int secondNumber;
        if (sum < 1000) {
            secondNumber = sum / 100 + sum % 100 / 10;
            System.out.println("First digit of sum: " + secondNumber);
        } else if (sum > 1000 && sum < 3000) {
            secondNumber = sum / 1000;
            System.out.println("First digit of sum: " + secondNumber);
        }

    }
}
