class Transaksi {
    private Penumpang penumpang;
    private Tiket tiket;
    private KeretaApi kereta;

    public Transaksi(Penumpang penumpang, Tiket tiket, KeretaApi kereta) {
        this.penumpang = penumpang;
        this.tiket = tiket;
        this.kereta = kereta;
    }

    public void tampilkanDetailTransaksi() {
        double hargaAkhir = kereta.hitungHarga(tiket.getHarga());

        System.out.println("=== DETAIL TRANSAKSI ===");
        System.out.println("Nama: " + penumpang.getNama());
        System.out.println("No Identitas: " + penumpang.getNoIdentitas());
        System.out.println("Kereta: " + kereta.namaKereta);
        System.out.println("Jenis: " + kereta.jenisKereta);
        System.out.println("Tujuan: " + tiket.getTujuan());
        System.out.println("Harga akhir: " + hargaAkhir);
    }

    public double getTotalHarga() {
        return kereta.hitungHarga(tiket.getHarga());
    }
}