class KeretaEkonomi extends KeretaApi implements Diskon {

    public KeretaEkonomi(String namaKereta) {
        super(namaKereta, "Ekonomi");
    }

    @Override
    public double hitungHarga(double hargaDasar) {
        return hargaDasar - hitungDiskon(hargaDasar);
    }

    @Override
    public double hitungDiskon(double harga) {
        return harga * 0.1; // diskon 10%
    }
}