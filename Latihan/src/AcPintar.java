public class AcPintar extends PerangkatPintar {
    public void aktifkan(){
        System.out.println("AC menyala dan mulai mendinginkan ruangan.");
    }

    public void aturSuhu(int suhu) {
        System.out.printf("Suhu ruangan diatur menjadi %d derajat", suhu);
    }
}
