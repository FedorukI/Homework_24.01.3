import com.sun.jdi.request.DuplicateRequestException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String pizza = scanner.nextLine().toLowerCase(Locale.ROOT);

        String resultPizza = pizza.replace("пошёл пошёл", "pizza");
        String resultPizza2 = pizza.replace("судьба судьба", "pizza");

        System.out.println("Результат: " + resultPizza);
        System.out.println("Результат2:" + resultPizza2);
        // самый лёгкий вариант, я хотел попробовать это обобщить, если программа увидит повторяющиеся слова, она их автоматом изменит на пицца





    }
}