import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<PerangkatPintar> perangkatPintars = new ArrayList<>();
        perangkatPintars.add(new LampuPintar());
        perangkatPintars.add(new AcPintar());

        for (PerangkatPintar isi : perangkatPintars){
            isi.aktifkan();
        }
        //Alasan bisa tercetak beda karena method aktifkan() di LampuPintar dan AcPintar sudah di override dan objek yang dibuat berpacu pada tipe data aktual dari objeknya, sehingga ketika method aktifkan() dipanggil, maka yang tercetak adalah method aktifkan() yang ada di class LampuPintar dan AcPintar, bukan method aktifkan() yang ada di class PerangkatPintar.

        if(perangkatPintars.get(1) instanceof AcPintar){
            AcPintar ac = (AcPintar) perangkatPintars.get(1);
            ac.aturSuhu(20);
        }

        PerangkatPintar alat1 = new LampuPintar();
        //alat1.aturKecerahan(75, "Putih"); //Baris menyebabkan error saat dikompilasi
        

    }
}
