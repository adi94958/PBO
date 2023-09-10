import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
