package inheritance;
//Muhammad Faiz Najmuddin
//255150707111013
public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia() {}
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getNik() { return nik; }
    public void setNik(String nik) { this.nik = nik; }
    public boolean isJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(boolean jenisKelamin) { this.jenisKelamin = jenisKelamin; }
    public boolean isMenikah() { return menikah; }
    public void setMenikah(boolean menikah) { this.menikah = menikah; }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        }
        return 15.0;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "nama         : " + nama +
               "\nnik          : " + nik +
               "\njenisKelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
               "\npendapatan   : " + getPendapatan();
    }
}
