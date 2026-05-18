public abstract class Pembayaran {

    // pakai protected agar bisa dipakai subclass
    protected String namaPembayar;
    protected double nominal;

    // Constructor buat isi data awal
    public Pembayaran(String namaPembayar, double nominal) {
        this.namaPembayar = namaPembayar;
        this.nominal = nominal;
    }

    // Method buat tampilin detail transaksi
    public void tampilkanDetail() {
        System.out.println("Nama Pembayar : " + namaPembayar);
        System.out.println("Nominal       : Rp " + nominal);
    }

    // Abstract method, wajib dioverride subclass
    public abstract void prosesPembayaran();
}