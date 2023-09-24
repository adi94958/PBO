import java.util.Scanner;
public class RestaurantMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Batagor",5000,30);
        menu.tambahMenuMakanan("Roti Bakar",12000,26);
        menu.tambahMenuMakanan("Indomie + Telur",10000,11);
        menu.tambahMenuMakanan("Kwetiaw",12000,10);
        menu.tambahMenuMakanan("Nasi Goreng", 12000, 15);
        menu.tambahMenuMakanan("Air Mineral", 3000, 25);
        menu.tambahMenuMakanan("Teh Manis", 1000, 20);
        menu.tambahMenuMakanan("Jus Alpukat", 8000, 10);
        menu.tambahMenuMakanan("Teh Botol",5000,10);
        menu.tambahMenuMakanan("Kopi",3000,10);

        boolean pesanLagi = true;
        while (pesanLagi) {
            menu.tampilMenuMakanan();
            System.out.print("Pilih menu (0 untuk keluar): ");
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                pesanLagi = false;
                System.out.println("Terima kasih sudah memesan!");
            } else if (pilihan >= 1 && pilihan <= menu.getId()) { // Clean Code: Menambahkan getter untuk id
                System.out.print("Jumlah pesanan: ");
                int jumlahPesanan = input.nextInt();
                menu.tambahPesanan(menu.getNamaMakanan(pilihan - 1), jumlahPesanan); // Clean Code: Menggunakan getter
                System.out.print("Pesan lagi? (ya/tidak): ");
                String jawaban = input.next();
                pesanLagi = jawaban.equalsIgnoreCase("ya");
            } else {
                System.out.println("Menu tidak valid.");
            }
        }
        menu.tampilkanPesanan();
    }
}