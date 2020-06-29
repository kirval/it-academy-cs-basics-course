import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String[] mas = new String [5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("Введите : ");
            mas[i]=sc.nextLine();
        }
        for(int i=4; i>=0; i--){
            System.out.println(mas[i]);
        }
    }
}