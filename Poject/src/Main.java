import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        System.out.println("First number");
        number.setNum1(scanner.nextInt());
        System.out.println("Second number");
        number.setNum2(scanner.nextInt());
        int[] arr = new int[2];
        arr[0] = number.getNum1();
        arr[1] = number.getNum2();
        int sum=0;
        for (int i = 0; i < arr.length;i++) {
                sum = arr[0] + arr[1];
        }
        System.out.println(sum);
    }
}