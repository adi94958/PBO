public class Restaurant {
    private static final int MAX_MENU = 10; // Membuat nilai final untuk maksimal menu
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private byte id;
    private String[] pesanan;
    private int[] qtyPesanan;
    private double[] totalHargaPesanan;
    public Restaurant() {
        namaMakanan = new String[MAX_MENU];
        hargaMakanan = new double[MAX_MENU];
        stok = new int[MAX_MENU];
        pesanan = new String[MAX_MENU];
        qtyPesanan = new int[MAX_MENU];
        totalHargaPesanan = new double[MAX_MENU];
    }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
        id++;
    }
    public void tampilMenuMakanan() {
        System.out.println("Menu Makanan:");
        System.out.println("-------------------------------");
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.printf("%d. %-15s [%d] Rp. %.0f%n", i + 1, namaMakanan[i], stok[i], hargaMakanan[i]);
            }
        }
    }
    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }
    public void tambahPesanan(String nama, int qty) {
        int indeks = cariIndeksMakanan(nama);
        if (indeks != -1) {
            pesanan[indeks] = nama;
            qtyPesanan[indeks] += qty;
            totalHargaPesanan[indeks] = qtyPesanan[indeks] * hargaMakanan[indeks];
            stok[indeks] -= qty;
        }
    }
    private int cariIndeksMakanan(String nama) {
        for (int i = 0; i < id; i++) {
            if (nama.equalsIgnoreCase(namaMakanan[i])) {
                return i;
            }
        }
        return -1; // Return -1 jika makanan tidak ditemukan.
    }
    public void tampilkanPesanan() {
        double totalBayar = 0;
        System.out.println("Pesanan Anda:");
        System.out.println("-------------------------------");
        for (int i = 0; i < id; i++) {
            if (pesanan[i] != null) {
                System.out.printf("%d. %-15s x%d Rp. %.0f%n", i + 1, pesanan[i], qtyPesanan[i], totalHargaPesanan[i]);
                totalBayar += totalHargaPesanan[i];
            }
        }
        System.out.printf("Total Bayar: Rp. %.0f", totalBayar);
    }

    public int getId() {
        return id;
    }

    public String getNamaMakanan(int index) {
        return namaMakanan[index];
    }
}


