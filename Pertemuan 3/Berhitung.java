import java.util.Scanner;
public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String operator = scanner.next();
        int B = scanner.nextInt();
        int result = 0;
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                result = A / B;
                break;
            case "%":
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }
        System.out.println(result);
    }
}
