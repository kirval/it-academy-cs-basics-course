import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = sc.nextInt();

        if (x >= 5) {
            System.out.println("x больше или равен 5.");
        }

    }

}