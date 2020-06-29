public class Task {
    public static void main (String[] args) {
        int x = 1;
        int result = x;
        int power = 1;
        do {
            System.out.println(x+power+result);
            x++;
        } while (result < 10);
    }
}