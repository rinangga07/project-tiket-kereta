abstract class Pembayaran {
    public abstract void prosesBayar(double jumlah);

    // method konkrit
    public void cetakStruk(double jumlah) {
        System.out.println("Total bayar: " + jumlah);
    }
}