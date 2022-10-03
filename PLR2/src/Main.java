import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("next");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("next");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("next");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int temp = 0;
        for (int i = 1; i < a; i++) {
            temp += i;
        }
        System.out.println(temp);
        System.out.println("next");
        while (true) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(b * c);
            System.out.println("Print 1 if you want to end or any number to repeat");
            int s = scanner.nextInt();
            if (s == 1) {
                break;
            }
        }

    }
}

