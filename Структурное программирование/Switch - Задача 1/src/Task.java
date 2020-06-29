import java.util.Scanner;

//import static org.graalvm.compiler.lir.asm.CompilationResultBuilderFactory.Default;

public class Task {
    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);

        String scan = go.nextLine();
        System.out.println();
        switch (scan) {
            case "Вверх": {
                System.out.println("Двигаться вверх");
                break;
            }
            case "Вниз": {
                System.out.println("Двигаться вниз");
                break;
            }
            case "Вправо": {
                System.out.println("Двигаться вправо");
                break;
            }
            case "Влево": {
                System.out.println("Двигаться влево");
                break;
            }
            case "Стоять": {
                System.out.println("Стоять на месте");
                break;
            }
            default: {
                System.out.println("Неверное направление!");
                break;
            }
        }
    }
}