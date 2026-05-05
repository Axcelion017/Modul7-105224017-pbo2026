import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<MetodePembayaran> transaksi = new ArrayList<>();

        transaksi.add(new EWallet());
        transaksi.add(new KartuKredit());

        for (MetodePembayaran i : transaksi){
            if(i instanceof EWallet){
                ((EWallet) i).bayar(100000);
            }else if(i instanceof KartuKredit){
                ((KartuKredit) i).bayar(100000);
            }else{
                i.bayar(100000);
            }
        }


    }
}
