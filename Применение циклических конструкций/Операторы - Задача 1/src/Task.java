import java.util.Scanner;

public class Task {
    //put your task here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        while(a != 0) {
            if (a % 2 == 0);
            System.out.println("Четное");
        }
        else {
            System.out.println("Нечетное");
        }
        a = sc.nextInt();
    }
}