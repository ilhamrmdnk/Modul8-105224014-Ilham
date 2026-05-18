public class Main {

    public static void main(String[] args) {

        // Membuat object pengiriman darat
        PengirimanDarat darat =
                new PengirimanDarat(
                        "DRT-001",
                        50,
                        100,
                        "Tronton"
                );

        // Membuat object pengiriman udara
        PengirimanUdara udara =
                new PengirimanUdara(
                        "UDR-999",
                        10,
                        800,
                        "GA-123",
                        5000000
                );

        // buat ubah status pengiriman
        darat.updateStatus(
                "Sedang di jalan tol Cipali"
        );

        udara.updateStatus(
                "Transit di Bandara Soekarno-Hatta"
        );

        // Array polymorphism
        LayananPengiriman[] daftar = {
                darat,
                udara
        };

        // looping buat baca semua objekc
        for (LayananPengiriman lp : daftar) {

            System.out.println(
                    "================================="
            );

            // tampilin resi
            lp.cetakResi();

            // cek apakah objek punya fitur traking, kalo bisa tampilin info2 nya
            if (lp instanceof LacakKargo) {

                // Downcasting ke interface
                LacakKargo lk = (LacakKargo) lp;

                System.out.println(
                        "Status Lokasi : " +
                        lk.cekLokasiTerakhir()
                );
            }

            // itung ongkir dasar
            double total =
                    lp.hitungOngkosKirim();

            // cek apakah ogbjek punya asuransi
            if (lp instanceof Asuransi) {

                // Downcasting ke interface
                Asuransi a = (Asuransi) lp;

                // Menampilkan polis
                a.cetakPolis();

                // Menghitung premi
                double premi =
                        a.hitungPremi(5000000);

                // Menampilkan premi
                System.out.println(
                        "Premi Asuransi : Rp " +
                        premi
                );

                // tambahin premi ke total
                total += premi;
            }

            // tampilkan total tagihan
            System.out.println(
                    "Total Tagihan : Rp " +
                    total
            );

            System.out.println(
                    "================================="
            );

            System.out.println();
        }
    }
}