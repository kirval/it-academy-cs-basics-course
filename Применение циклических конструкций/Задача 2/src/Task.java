import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Тута будет A : ");
        int a = sc.nextInt();
        System.out.print("А тута будет B : ");
        int b = sc.nextInt();
        int s = 0;
        if( a <= b){
            for (int i = a; i <= b; i++){
                s += i;
            }
        }
        System.out.println("И по условию получаем : " + s);
    }
}