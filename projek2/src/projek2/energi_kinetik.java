package projek2;

public class energi_kinetik {
    public static void main(String[] args) {
        // Data
        double massa = 0.145; // Massa dalam kilogram
        double kecepatanAwal = 0.0; // Kecepatan awal dalam m/s
        double kecepatanAkhir = 25.0; // Kecepatan akhir dalam m/s

        // Menghitung energi kinetik
        double energiKinetik = 0.5 * massa * kecepatanAkhir * kecepatanAkhir;

        System.out.println("a. Energi kinetik bola baseball adalah " + energiKinetik + " joule.");

        // Menghitung usaha yang dilakukan
        double usaha = 0.5 * massa * (kecepatanAkhir * kecepatanAkhir - kecepatanAwal * kecepatanAwal);

        System.out.println("b. Usaha yang dilakukan pada bola untuk mencapai kecepatan ini adalah " + usaha + " joule.");
    }
}

