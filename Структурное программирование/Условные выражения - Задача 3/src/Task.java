import java.util.Scanner;

public class Task {
    //put your task here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        if (i>=25 && i<=100){
            System.out.println("Попало");
        }
        else{
            System.out.println("Не попало");
        }
    }
}