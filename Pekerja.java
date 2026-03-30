package inheritance;
//Muhammad Faiz Najmuddin
//255150707111013

import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja() {}

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGajiPokok() { return gaji; }
    public void setGaji(double gaji) { this.gaji = gaji; }
    public LocalDate getTahunMasuk() { return tahunMasuk; }
    public void setTahunMasuk(LocalDate tahunMasuk) { this.tahunMasuk = tahunMasuk; }
    public int getJumlahAnak() { return jumlahAnak; }
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }

    public int getLamaBekerja() {
        return Period.between(tahunMasuk, LocalDate.now()).getYears();
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
        return super.toString() + String.format(
            "%nTahun Masuk   : %s%nLama Bekerja  : %d tahun%nJumlah Anak   : %d%nGaji Total    : $%.2f",
            tahunMasuk.toString(), getLamaBekerja(), jumlahAnak, getGaji()
        );
    }
}
