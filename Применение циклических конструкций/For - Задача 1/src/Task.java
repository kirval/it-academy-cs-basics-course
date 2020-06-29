import java.util.Scanner;
public class Task {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,x;
        A=sc.nextInt();
        B=sc.nextInt();

        if (B == 0){
            System.out.println("Результат равен 1!");
        } else if (A == 0){
            System.out.println("Результат равен 0!");
        } else {
            for (int i = 1; i <= B; i++){
                x *= A;
            }
            System.out.println("Результат равен" + x);
        }
    }
}