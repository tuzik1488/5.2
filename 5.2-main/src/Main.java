public class Main {
    public static void main(String[] args) {
        // Завдання 1
        System.out.println("-------------Завдання 1-------------");
        int number1 = 15;
        int number2 = 7;

        float dil = (float)number1 / number2;
        System.out.println("Ділення - " + dil);

        int zal = number1 % number2;
        System.out.println("Залишок від ділення - " + zal);

        // Завдання 2
        System.out.println("-------------Завдання 2-------------");

        int number = 78;

        int first = number / 10;
        System.out.println("Перше число = " + first);

        int last = number % 10;
        System.out.println("Друге число = " + last);

        int summa = first + last;
        System.out.println("Сумма чисел = " + summa);


        // Завдання 3
        System.out.println("-------------Завдання 3-------------");

        double number11 = 3.4;

        int cile = (int) number11;
        int dribna = (int) ((number11 - cile) * 10);
        int okrugl = cile + (dribna >= 5 ? 1 : 0);

        System.out.println("Округлене число: " + okrugl);
    }
}