public class LayananReguler extends LayananEkspedisi {
    LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    double hitungOngkir() {
        double beratEfektif = hitungBeratEfektif();
        return beratEfektif * 15000; // Tarif per kg untuk layanan reguler
    }

    double hitungOngkir(boolean isMember, int jarakKm){
        double ongkir = hitungOngkir();
        if(isMember){
            ongkir *= 0.9; // Diskon 10% untuk member
        }
        return ongkir + (jarakKm*500);
    }

    
}
