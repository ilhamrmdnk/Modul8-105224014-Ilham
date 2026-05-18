// Class KartuKredit mewarisi Pembayaran
// dan mengimplementasikan interface Keamanan
public class KartuKredit extends Pembayaran implements Keamanan {

    // Nomor kartu bersifat private
    private String nomorKartu;

    // Constructor buat isi data pembayaran dan nomor kartu
    public KartuKredit(String namaPembayar, double nominal, String nomorKartu) {

        // panggil constructor parent
        super(namaPembayar, nominal);

        this.nomorKartu = nomorKartu;
    }

    // Override method autentikasi dari interface
    @Override
    public boolean autentikasi() {

        // Simulasi autentikasi PIN berhasil
        System.out.println("Autentikasi PIN berhasil.");

        return true;
    }

    // Override method proses pembayaran
    @Override
    public void prosesPembayaran() {

        // Menghitung biaya admin 2%
        double admin = nominal * 0.02;

        // Menghitung total tagihan
        double total = nominal + admin;

        // Menampilkan hasil pembayaran
        System.out.println("Biaya Admin   : Rp " + admin);
        System.out.println("Total Bayar   : Rp " + total);
    }
}