package inheritance;
//Muhammad Faiz Najmuddin
//255150707111013
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       
        System.out.println("TEST CASE: MANUSIA");
        

        Manusia m1 = new Manusia("Budi Santoso", true, "3507010101900001", true);
        System.out.println("\n[1a] Laki-laki, sudah menikah:");
        System.out.println(m1);
        System.out.println("Tunjangan: $" + m1.getTunjangan());

        Manusia m2 = new Manusia("Siti Rahayu", false, "3507015505950002", true);
        System.out.println("\n[1b] Perempuan, sudah menikah:");
        System.out.println(m2);
        System.out.println("Tunjangan: $" + m2.getTunjangan());

        Manusia m3 = new Manusia("Andi Wijaya", true, "3507010203000003", false);
        System.out.println("\n[1c] Belum menikah:");
        System.out.println(m3);
        System.out.println("Tunjangan: $" + m3.getTunjangan());

        
        System.out.println("TEST CASE: MAHASISWA FILKOM");
       

        MahasiswaFILKOM mf1 = new MahasiswaFILKOM(
            "Rizky Pratama", true, "3507011001980004", false,
            "215150407111001", 2.75
        );
        System.out.println("\n[2a] IPK < 3 (beasiswa $0):");
        System.out.println(mf1);
        System.out.println("Beasiswa: $" + mf1.getBeasiswa());

        MahasiswaFILKOM mf2 = new MahasiswaFILKOM(
            "Dewi Anggraini", false, "3507015205990005", false,
            "215150407111002", 3.25
        );
        System.out.println("\n[2b] IPK 3.0 - 3.5 (beasiswa $50):");
        System.out.println(mf2);
        System.out.println("Beasiswa: $" + mf2.getBeasiswa());

        MahasiswaFILKOM mf3 = new MahasiswaFILKOM(
            "Farhan Maulana", true, "3507010804010006", false,
            "215150407111003", 3.85
        );
        System.out.println("\n[2c] IPK 3.5 - 4.0 (beasiswa $75):");
        System.out.println(mf3);
        System.out.println("Beasiswa: $" + mf3.getBeasiswa());

        
        System.out.println("         TEST CASE: PEKERJA");
       

        Pekerja p1 = new Pekerja(
            "Hendra Kurniawan", true, "3507011505830007", true,
            1000.0, LocalDate.now().minusYears(2), 2
        );
        System.out.println("\n[3a] Lama bekerja 2 tahun, anak 2:");
        System.out.println(p1);
        System.out.printf("Bonus     : $%.2f%n", p1.getBonus());
        System.out.printf("Tunjangan : $%.2f%n", p1.getTunjangan());

        Pekerja p2 = new Pekerja(
            "Yuni Astuti", false, "3507015608840008", false,
            1500.0, LocalDate.now().minusYears(9), 0
        );
        System.out.println("\n[3b] Lama bekerja 9 tahun:");
        System.out.println(p2);
        System.out.printf("Bonus     : $%.2f%n", p2.getBonus());
        System.out.printf("Tunjangan : $%.2f%n", p2.getTunjangan());

        Pekerja p3 = new Pekerja(
            "Agus Setiawan", true, "3507011201750009", true,
            2000.0, LocalDate.now().minusYears(20), 10
        );
        System.out.println("\n[3c] Lama bekerja 20 tahun, anak 10:");
        System.out.println(p3);
        System.out.printf("Bonus     : $%.2f%n", p3.getBonus());
        System.out.printf("Tunjangan : $%.2f%n", p3.getTunjangan());

        
        System.out.println("         TEST CASE: MANAGER");
        

        Manager mgr = new Manager(
            "Bambang Hermanto", true, "3507010907720010", true,
            7500.0, LocalDate.now().minusYears(15), 3,
            "Technology"
        );
        System.out.println("\n[4] Manager, lama bekerja 15 tahun, gaji $7500:");
        System.out.println(mgr);
        System.out.printf("Bonus      : $%.2f%n", mgr.getBonus());
        System.out.printf("Tunjangan  : $%.2f%n", mgr.getTunjangan());
        System.out.printf("Total Gaji : $%.2f%n", mgr.getGaji());
    }
}
