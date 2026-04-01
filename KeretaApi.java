class KeretaApi {
    protected String namaKereta;
    protected String jenisKereta;

    public KeretaApi(String namaKereta, String jenisKereta) {
        this.namaKereta = namaKereta;
        this.jenisKereta = jenisKereta;
    }

    public double hitungHarga(double hargaDasar) {
        return hargaDasar;
    }
}