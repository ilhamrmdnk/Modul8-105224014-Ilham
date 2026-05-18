// Interface untuk fitur pelacakan barang
public interface LacakKargo {

    // Method update status lokasi barang
    void updateStatus(String status);

    // Method ngambil lokasi terakhir
    String cekLokasiTerakhir();
}