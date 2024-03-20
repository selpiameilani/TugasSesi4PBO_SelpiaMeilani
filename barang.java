class barang {
    void info() {
        System.out.println("Informasi barang: Barang umum");
    }
}

class barangPromo extends barang {
    @Override
    void info() {
      System.out.println("Informasi barang: Barang promo");
    }
}

