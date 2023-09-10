import java.math.BigInteger;
import java.util.Scanner;
public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1Str = scanner.nextLine();
        String num2Str = scanner.nextLine();

        BigInteger num1 = new BigInteger(num1Str);
        BigInteger num2 = new BigInteger(num2Str);

        BigInteger resultAdd = num1.add(num2);
        BigInteger resultMultiply = num1.multiply(num2);

        System.out.println(resultAdd);
        System.out.println(resultMultiply);

        scanner.close();
    }
}
