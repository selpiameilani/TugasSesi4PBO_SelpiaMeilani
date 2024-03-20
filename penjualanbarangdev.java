/**
 *
 * @author Selpia Meilani
 */
class penjualanbarang {
    void hitungTotal(int hargaSatuan, int jumlah) {
        int total = hargaSatuan * jumlah;
        System.out.println("Total harga: " + total);
    }

    void hitungTotal(int hargaSatuan, int jumlah, int diskon) {
        int total = (hargaSatuan * jumlah) - diskon;
        System.out.println("Total harga setelah diskon: " + total);
    }
}

class PenjualanBarangPromo extends penjualanbarang {
    @Override
    void hitungTotal(int hargaSatuan, int jumlah, int diskon) {
        int total = (hargaSatuan * jumlah) - diskon - 100; // Diskon tambahan
        System.out.println("Total harga setelah diskon dan diskon tambahan: " + total);
    }
}

