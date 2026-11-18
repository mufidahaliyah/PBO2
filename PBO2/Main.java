package PBO2;

/** Program utama Latihan 2: menampilkan nama, kode, dan suku bunga akun. */
public class Main {
    public static void main(String[] args) {
        System.out.println("Daftar tipe akun:");
        for (AccountType type : AccountType.values()) {
            System.out.printf("Nama: %s | Kode: %s | Suku bunga: %.2f%%%n",
                    type.name(), type.getCode(), type.getInterestRate() * 100);
        }
    }
}
