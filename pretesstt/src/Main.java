public class Main {
    public static void main(String[] args) {

        Programmer p1 = new Programmer("Ilham", 5000000);

        System.out.println("Nama Programmer : " + p1.nama);
        System.out.println("Total Gaji      : " + p1.hitungGaji());
    }
}