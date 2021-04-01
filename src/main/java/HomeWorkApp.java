public class HomeWorkApp {
    public HomeWorkApp() {
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
        System.out.println("checkSumSign()");
    }

    public static void checkSumSign() {
        int a = 30;
        int b = 60;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }

        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
        }

        if (value >= 1 || value <= 100) {
            System.out.println("Желтый");
        }

        if (value >= 101) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}

