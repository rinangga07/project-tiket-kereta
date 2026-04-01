public class Main {
    public static void main(String[] args) {

        Penumpang p = new Penumpang("Rangga", "12345");
        Tiket t = new Tiket("T001", "Jakarta", 200000);

        KeretaApi kereta = new KeretaEkonomi("KAI Ekonomi");

        Transaksi tr = new Transaksi(p, t, kereta);
        tr.tampilkanDetailTransaksi();

        Pembayaran bayar = new BayarCash();
        bayar.prosesBayar(tr.getTotalHarga());
        bayar.cetakStruk(tr.getTotalHarga());
    }
}