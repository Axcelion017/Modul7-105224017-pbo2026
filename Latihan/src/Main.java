import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<PerangkatPintar> perangkatPintars = new ArrayList<>();
        perangkatPintars.add(new LampuPintar());
        perangkatPintars.add(new AcPintar());

        for (PerangkatPintar isi : perangkatPintars){
            isi.aktifkan();
        }
        //Alasan bisa tercetak beda karena method aktifkan() di LampuPintar dan AcPintar sudah di override dan yang terjadi adalah runtime polymorhphism jadi dia mengecek tipe data aktual dari masing masing objek yang tersimpan di array list, sehingga ketika method aktifkan() dipanggil, maka yang tercetak adalah method aktifkan() yang ada di class LampuPintar dan AcPintar, bukan method aktifkan() yang ada di class PerangkatPintar.

        if(perangkatPintars.get(1) instanceof AcPintar){
            AcPintar ac = (AcPintar) perangkatPintars.get(1);
            ac.aturSuhu(20);
        }

        PerangkatPintar alat1 = new LampuPintar();
        //alat1.aturKecerahan(75, "Putih"); //Baris menyebabkan error saat dikompilasi
        //Analsis: Karena terbentuk dalam tipe data PerangkatPintar, maka hanya method yang ada di class PerangkatPintar yang bisa dipanggil, sedangkan method aturKecerahan() tidak ada di class PerangkatPintar melainkan ada di class LampuPintar. Cara memperbaikinya adalah dengan melakukan downcasting ke tipe data LampuPintar terlebih dahulu sebelum memanggil method aturKecerahan().
        ((LampuPintar)alat1).aturKecerahan(75, "Putih");

    }
}
