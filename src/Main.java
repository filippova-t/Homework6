import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] costs = generateRandomArray();
        //Задение 1
        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задание 2
        int maxCost = 99_999;
        for (final int current : costs) {
            if (current > maxCost) {
                maxCost = current;
            }
        }
        int minCost = 200_001;
        for (final int current : costs) {
            if (current < minCost) {
                minCost = current;
            }
        }
        System.out.print("Минимальная сумма трат за день составила " +  minCost + " рублей. Максимальная сумма трат ");
        System.out.println("за день составила " + maxCost + " рублей");

        //Задание 3
        double averageCost = (double) sum / 30;
        String averageCostRounded = String.format("%.2f",averageCost);
        System.out.println("Средняя сумма трат за месяц составила " + averageCostRounded + " рублей");

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);

        }


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] costs = new int[30];
        for (int i = 0; i < costs.length; i++) {
            costs [i] = random.nextInt(100_000) + 100_000;
        }
        return costs;
    }
}