import java.util.Scanner;

public class Task {
    //put your task here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Введите А: ");
        int a = sc.nextInt();
            System.out.println("Введите В: ");
        int b = sc.nextInt();
            System.out.println("Введите Х: ");
        int x = sc.nextInt();

        if (a>b) {
            System.out.println("А и В введены не верно");
        }
        else{
            if (x<a) {
                System.out.println("Недосып");
            }
            if (x>b) {
                System.out.println("Пересып");
            }
            if (x>=a && x<=b) {
                System.out.println("Нормально");
            }
        }

    }
}