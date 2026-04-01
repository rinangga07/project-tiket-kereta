class KeretaBisnis extends KeretaApi {

    public KeretaBisnis(String namaKereta) {
        super(namaKereta, "Bisnis");
    }

    @Override
    public double hitungHarga(double hargaDasar) {
        return hargaDasar + 50000; // biaya tambahan
    }

    // contoh overloading
    public double hitungHarga(double hargaDasar, double pajak) {
        return hargaDasar + pajak;
    }
}