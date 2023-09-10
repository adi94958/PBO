import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputPlates = input.nextLine();
        String[] plates = inputPlates.split(" ");
        int total = 0;
        for (String plate : plates) {
            int number = Integer.parseInt(plate.replaceAll("[^0-9]", ""));
            total += number;
        }
        if ((total - 999999) % 5 != 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
