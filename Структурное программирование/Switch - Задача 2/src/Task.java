import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер фигуры: ");
        int x = scanner.nextInt(); //считывание int с клавиатуры
        switch (x) {
            case 1:
                System.out.print("Вы выбрали квадрат");
                break;
            case 2:
                System.out.print("Вы выбрали круг");
                break;
            case 3:
                System.out.print("Вы выбрали треугольник");
                break;
            case 4:
                System.out.print("Вы выбрали ромб");
                break;
            default:
                System.out.print("Нет такой фигуры");
        }
    }
}