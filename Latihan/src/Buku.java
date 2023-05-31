public class Buku {
    String judul, pengarang;
    public void setJenis(String jenis){
        if (judul == "Pemrograman Java") {
            jenis = "Prog";
        }
    }
    public int ambilHalaman(){
        if(judul =="Pemrograman java") {
            return 100;
        }
        return 0;
    }

    public static void main(String[] args) {
        Buku buku = new Buku();
    }
}