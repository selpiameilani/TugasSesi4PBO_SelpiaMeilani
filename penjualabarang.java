class PenjualanBarang {
    void hitungTotal(int hargaSatuan, int jumlah) {
        int total = hargaSatuan * jumlah;
        System.out.println("Total harga: " + total);
    }

    void hitungTotal(int hargaSatuan, int jumlah, int diskon) {
        int total = (hargaSatuan * jumlah) - diskon;
        System.out.println("Total harga setelah diskon: " + total);
    }
}

