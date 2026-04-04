package inheritance;
//Muhammad Faiz Najmuddin
//255150707111013
public class Manager extends Pekerja {
    private String departemen;
    public Manager() {}

    public Manager(String departemen, double gaji, int tahunMasuk, int bulanMasuk,
                   int tanggalMasuk, int jumlahAnak, String nama, String nik,
                   boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, bulanMasuk, tanggalMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() { return departemen; }
    public void setDepartemen(String departemen) { this.departemen = departemen; }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (getGajiPokok() * 0.10);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\ndepartemen   : " + departemen;
    }
}
