import java.util.Scanner;

public class Task {
    //put your task here

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String res;
        switch (x) {
            case 1:
            case 2:
            case 12:
                res = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                res = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                res = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                res = "Осень";
                break;
            default:
                res = "Нет такого месяца!";
        }
        System.out.println(res);
    }

}