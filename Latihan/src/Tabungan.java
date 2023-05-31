public class Tabungan {
    public double saldo;
    public Tabungan (double jumlah){
        saldo=jumlah;
    }
    public void ambil(double jumlah){
        saldo=saldo-jumlah;
    }
    public void nabung(double jumlah){
        saldo=saldo+jumlah;
    }
}
class TesTabungan{
    public static void main(String[] args) {
        Tabungan rekening = new Tabungan(100000);
        System.out.println("Jumlah Saldo : "+rekening.saldo);
        rekening.ambil(80000);
        System.out.println("Jumlah Saldo : "+rekening.saldo);
        rekening.nabung(100000);
        System.out.println("Jumlah Saldo : "+rekening.saldo);
    }
}
