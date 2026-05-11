public class LayananEkspedisi {
    protected String nomorResi;
    protected double beratAktualKg, panjang, lebar, tinggi;
    LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double hitungBeratEfektif() {
        double beratVolume = (panjang * lebar * tinggi) / 6000;
        if (beratVolume > beratAktualKg) {
            return beratVolume;
        } else {
            return beratAktualKg;
        }
    }

    void cetakResi(){
        System.out.println("Nomor Resi: " + this.nomorResi);
        System.out.println("Berat Efektif (kg): " + this.hitungBeratEfektif());
    }

    double hitungOngkir() {
        return 0.0;
    }
}
