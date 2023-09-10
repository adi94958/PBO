import java.util.Scanner;
public class GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penjualan = scanner.nextInt();
        int hargaPerItem = 50_000;
        int gajiPokok = 500_000;
        double bonusPenjualan = 0;
        double denda = 0;
        if (penjualan >= 80) {
            bonusPenjualan = 0.35 * penjualan * hargaPerItem;
        } else {
            if (penjualan >= 40) {
                bonusPenjualan = 0.25 * penjualan * hargaPerItem;
            } else {
                if (penjualan < 15){
                    denda = 0.15 * (15 - penjualan) * hargaPerItem;
                } else {
                    bonusPenjualan = 0.10 * penjualan * hargaPerItem;
                }
            }
        }
        double totalGaji = gajiPokok + bonusPenjualan - denda;
        System.out.println((int) totalGaji);
    }
}
