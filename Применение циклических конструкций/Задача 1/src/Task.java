public class Task {
    public static void main(String[] args) {
        int s = 0;

        for( int i = 1; i <= 100; i++){
            if( i % 7 == 0){
                s += i;
            }
        }
        System.out.println("Наша ответ : " + s);
    }
}