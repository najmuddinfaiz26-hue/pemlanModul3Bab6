package inheritance;
//Muhammad Faiz Najmuddin
//255150707111013
import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private int tahunMasuk;
    private int bulanMasuk;
    private int tanggalMasuk;
    private int jumlahAnak;

    public Pekerja() {}

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk,
                   int jumlahAnak, String nama, String nik,
                   boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.bulanMasuk = bulanMasuk;
        this.tanggalMasuk = tanggalMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGajiPokok() { return gaji; }
    public void setGaji(double gaji) { this.gaji = gaji; }
    public int getTahunMasuk() { return tahunMasuk; }
    public int getBulanMasuk() { return bulanMasuk; }
    public int getTanggalMasuk() { return tanggalMasuk; }
    public int getJumlahAnak() { return jumlahAnak; }
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }

    public int getLamaBekerja() {
        LocalDate masuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
        return Period.between(masuk, LocalDate.now()).getYears();
    }

    public double getBonus() {
        int lama = getLamaBekerja();
        if (lama > 10)  return gaji * 0.15;
        if (lama >= 5)  return gaji * 0.10;
        return gaji * 0.05;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak * 20.0);
    }

    public double getGaji() {
        return gaji + getBonus() + getTunjangan();
    }

    @Override
    public double getPendapatan() {
        return getGaji();
    }

    @Override
    public String toString() {
        return super.toString() +
               "\ntahun masuk  : " + tanggalMasuk + " " + bulanMasuk + " " + tahunMasuk +
               "\njumlah anak  : " + jumlahAnak +
               "\ngaji         : " + gaji;
    }
}
