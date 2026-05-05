public class App {
    public static void main(String[] args) throws Exception {
        Karakter mage1 = new Mage();

        mage1.serang();

        if (mage1 instanceof Mage) {
            Mage m1 = (Mage) mage1;
            m1.serang("200");
        }

        ((Mage)mage1).serang("200");
    }
}
