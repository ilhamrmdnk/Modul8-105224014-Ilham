// Class pengiriman udara
// warisin LayananPengiriman
// implementasiin LacakKargo dan Asuransi
public class PengirimanUdara extends LayananPengiriman
        implements LacakKargo, Asuransi {

    // Atribut tambahan
    private String nomorPenerbangan;
    private String statusSaatIni;
    private double nilaiBarang;

    // Constructor
    public PengirimanUdara(String noResi,
                           double beratBarang,
                           double jarakTempuh,
                           String nomorPenerbangan,
                           double nilaiBarang) {

        // manggil constructor parent
        super(noResi, beratBarang, jarakTempuh);

        this.nomorPenerbangan = nomorPenerbangan;
        this.nilaiBarang = nilaiBarang;

        this.statusSaatIni =
                "Menunggu Jadwal Penerbangan";
    }

    // Override method hitung ongkir
    @Override
    public double hitungOngkosKirim() {

        // rumus ongkir buat udara
        return (beratBarang * 25000) +
               (jarakTempuh * 5000);
    }

    // Override method premi asuransi
    @Override
    public double hitungPremi(double nilaiBarang) {

        // Premi 3%
        return nilaiBarang * 0.03;
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