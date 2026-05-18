// Class pengiriman darat
// Mewarisi LayananPengiriman
// implementasiin LacakKargo
public class PengirimanDarat extends LayananPengiriman
        implements LacakKargo {

    // Atribut tambahan
    private String jenisTruk;
    private String statusSaatIni;

    // Constructor
    public PengirimanDarat(String noResi,
                           double beratBarang,
                           double jarakTempuh,
                           String jenisTruk) {

        // Memanggil constructor parent
        super(noResi, beratBarang, jarakTempuh);

        this.jenisTruk = jenisTruk;

        this.statusSaatIni = "Menunggu Kurir";
    }

    // Override method hitung ongkir
    @Override
    public double hitungOngkosKirim() {

        // rumus ongkir buat darat
        double ongkir =
                (beratBarang * 5000) +
                (jarakTempuh * 2000);

        // Tambahan biaya jika truk tronton
        if (jenisTruk.equalsIgnoreCase("Tronton")) {

            ongkir += 150000;
        }

        return ongkir;
    }

    // Override update status
    @Override
    public void updateStatus(String status) {

        statusSaatIni = status;
    }

    // Override cek lokasi terakhir
    @Override
    public String cekLokasiTerakhir() {

        return statusSaatIni;
    }
}