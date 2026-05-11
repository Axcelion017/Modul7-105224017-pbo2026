public class LayananExpress extends LayananEkspedisi {

    LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }
    
    double hitungOngkir() {
        double beratEfektif = hitungBeratEfektif();
        return beratEfektif * 30000; // Tarif per kg untuk layanan express
    }

    void klaimAsuransi(double nilaiBarang) {
        if(nilaiBarang > 1000000) {
            System.out.printf("Klaim Asuransi VIP Rp%.2f untuk resi %s sedang diproses prioritas.", nilaiBarang, this.nomorResi); // Klaim asuransi 5% dari nilai barang
        } else {
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja.");
        }
    }
}
