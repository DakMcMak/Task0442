import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        while(true){
            int number = scanner.nextInt();
            j = j + number;
            if (number == -1){
                System.out.println(j);
                break;
            }
        }
    }
}
