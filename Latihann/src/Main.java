import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // bikin Kartu Kredit
        Pembayaran kartu =
                new KartuKredit(
                        "Ilham",
                        500000,
                        "1234-5678-9999"
                );

        // bikin E-Wallet
        Pembayaran ewallet =
                new EWallet(
                        "Budi",
                        250000,
                        "08123456789"
                );

        // ArrayList bertipe Pembayaran
        ArrayList<Pembayaran> daftar = new ArrayList<>();

        // nambahin objek ke ArrayList
        daftar.add(kartu);
        daftar.add(ewallet);

        //looping buat baca semua transaksi
        for (Pembayaran p : daftar) {

            System.out.println("===== DETAIL TRANSAKSI =====");

            // tampilin detail pembayaran
            p.tampilkanDetail();

            // cek apakah objek mengimplementasikan interface Keamanan
            if (p instanceof Keamanan) {

                // Downcasting ke interface Keamanan
                Keamanan k = (Keamanan) p;

                // Jika autentikasi berhasil proses bayar
                if (k.autentikasi()) {
                    p.prosesPembayaran();
                }
            }

            System.out.println();
        }
    }
}