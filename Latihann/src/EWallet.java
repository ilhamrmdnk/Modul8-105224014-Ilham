// Class EWallet mewarisi Pembayaran
// dan mengimplementasikan interface Keamanan
public class EWallet extends Pembayaran implements Keamanan {

    // Nomor HP private
    private String nomorHP;

    // Constructor buat isi data
    public EWallet(String namaPembayar, double nominal, String nomorHP) {

        // panggil constructor parent
        super(namaPembayar, nominal);

        this.nomorHP = nomorHP;
    }

    // Override method autentikasi
    @Override
    public boolean autentikasi() {

        // Simulasi autentikasi berhasil
        System.out.println("Autentikasi E-Wallet berhasil.");

        return true;
    }

    // Override method proses pembayaran
    @Override
    public void prosesPembayaran() {

        // Tidak ada biaya admin
        double total = nominal;

        // Menampilkan total pembayaran
        System.out.println("Biaya Admin   : Rp 0");
        System.out.println("Total Bayar   : Rp " + total);
    }
}