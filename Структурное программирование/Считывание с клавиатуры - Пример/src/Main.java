import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите long: ");
        long l1 = scanner.nextLong(); //считывание long с клавиатуры

        System.out.print("Введите int: ");
        int i1 = scanner.nextInt(); //считывание int с клавиатуры

        System.out.print("Введите строку: ");
        String str1 = scanner.next(); //считывание String с клавиатуры

        System.out.print("Введите boolean: ");
        boolean bool1 = scanner.nextBoolean(); //считывание boolean с клавиатуры

        System.out.println("Ваш long: " + l1);
        System.out.println("Ваш int: " + i1);
        System.out.println("Ваш String: " + str1);
        System.out.println("Ваш boolean: " + bool1);
    }
}