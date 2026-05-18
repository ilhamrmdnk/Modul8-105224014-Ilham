// Abstract class sebagai induk semua layanan pengiriman
public abstract class LayananPengiriman {

    // Protected biar bisa dipakai subclass
    protected String noResi;
    protected double beratBarang;
    protected double jarakTempuh;

    // Constructor biat isi data awal
    public LayananPengiriman(String noResi,
                             double beratBarang,
                             double jarakTempuh) {

        this.noResi = noResi;
        this.beratBarang = beratBarang;
        this.jarakTempuh = jarakTempuh;
    }

    // Method buat cetak data resi
    public void cetakResi() {

        System.out.println("No Resi       : " + noResi);
        System.out.println("Berat Barang  : " + beratBarang + " kg");
        System.out.println("Jarak Tempuh  : " + jarakTempuh + " km");
    }

    // Abstract method biuat menghitung ongkir
    public abstract double hitungOngkosKirim();
}