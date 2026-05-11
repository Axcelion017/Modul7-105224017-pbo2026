import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<LayananEkspedisi> daftarLayanan = new ArrayList<>();
        daftarLayanan.add(new LayananReguler("REG-11", 2, 50, 50, 50));
        daftarLayanan.add(new LayananExpress("EXP-22", 5, 10, 10, 10));
        daftarLayanan.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        double totalPendapatanPerusahaan = 0.0;

        for (LayananEkspedisi layanan : daftarLayanan) {
            layanan.cetakResi();
            totalPendapatanPerusahaan += layanan.hitungOngkir();

            if (layanan instanceof LayananReguler) {
                double ongkirMember = ((LayananReguler)layanan).hitungOngkir(true, 25);
                System.out.printf("Ongkir dengan promo member untuk resi %s: Rp%.2f%n", layanan.nomorResi, ongkirMember);
            } else if (layanan instanceof LayananExpress) {
                ((LayananExpress)layanan).klaimAsuransi(1500000);
            } else if (layanan instanceof LayananInternasional) {
                ((LayananInternasional)layanan).cetakManifest();
            }
            System.out.println();
        }

        System.out.printf("Total Pendapatan Perusahaan dari Ongkir Dasar: Rp%.2f%n", totalPendapatanPerusahaan);
    }
}
