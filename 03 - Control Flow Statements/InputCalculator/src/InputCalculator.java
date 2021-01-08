import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        long avg = 0L;
        boolean invalid = false;

        while (!invalid) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                counter++;
                sum += scanner.nextInt();
            } else {
                invalid = true;
            }

            scanner.nextLine();
        }

        avg = Math.round((double) sum / counter);

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
