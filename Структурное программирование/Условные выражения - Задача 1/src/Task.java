import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = sc.nextInt();
        if (x >= 0) {
            System.out.print("Положительные");
        }
        else {
            System.out.print("Отрицательные");
        }

    }
}