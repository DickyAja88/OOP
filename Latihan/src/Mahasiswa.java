public class Mahasiswa {
    public int nrp;
    public String nama;
    public Mahasiswa (int i, String n){
        this.nrp =i;
        this.nama=n;
    }
    public int getNrp(){
        return nrp;
    }
    public String getNama(){
        return nama;
    }
}
class TesMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(123,"Dicky");
        System.out.println("NRP = "+mahasiswa.getNrp());
        System.out.println("Nama = "+mahasiswa.getNama());
    }
}
