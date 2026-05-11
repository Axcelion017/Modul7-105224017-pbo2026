public class LayananInternasional extends LayananEkspedisi{
    String tujuan;
    double nilaiBarangUSD;

    LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String tujuan, double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.tujuan = tujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    double hitungOngkir() {
        double beratEfektif = hitungBeratEfektif();
        double ongkirDasar = beratEfektif * 200000;
        double pajak;
        if (this.nilaiBarangUSD > 50) {
            pajak = ongkirDasar * 0.2; 
        } else {
            pajak = 0;
        }
        return ongkirDasar + pajak;
    }
    void cetakManifest() {
        System.out.println("Manifest Internasional ke " + this.tujuan + " - Deklarasi Nilai: $" + this.nilaiBarangUSD);
    }

}
