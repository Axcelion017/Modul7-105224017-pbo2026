public class LampuPintar extends PerangkatPintar{
    public void aktifkan(){
        System.out.println("Lampu menyala dengan tingkat kecerahan standar.");
    }

    public void aturKecerahan(int level) {
        System.out.printf("Kecerahan lampu diatur ke level [level]%.", level);
    }

    public void aturKecerahan(int level, String warna){
        System.out.printf("Kecerahan lampu diatur ke level [level]% dan warna [warna]s.", level, warna);
    }
}
