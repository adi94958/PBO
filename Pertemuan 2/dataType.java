import java.util.Scanner;
public class dataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String angkaString = scanner.nextLine();
            try {
                long angka = Long.valueOf(angkaString);
                System.out.println(angka + " can be fitted in:");
                if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                    System.out.println("* integer");
                }
                if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(angkaString + " can’t be fitted anywhere");
            }
        }
    }
}

