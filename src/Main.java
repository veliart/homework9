public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i: arr) {
            total += i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }
    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxPayment = -1;
        int minPayment = 200_001; // Т.к. по условию значения не превышают 200_000.
        for (int i: arr) {
            if (i > maxPayment) {
                maxPayment = i;
            }
            if (i < minPayment) {
                minPayment = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxPayment + " рублей");
    }
    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i: arr) {
            total += i;
        }
        double averagePayment = (double) total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " рублей");
    }
    public static void task4(){
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0;i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}