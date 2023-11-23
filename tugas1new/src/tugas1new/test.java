package tugas1new;


	import java.util.Scanner;
	public class test {
	
	public class Manager {
	    private int kehadiran;
	    private float tunjanganGolongan;
	    private float tunjanganJabatan;
	    private float tunjanganKehadiran;

	    // Konstruktor
	    public Manager(int kehadiran, float tunjanganGolongan, float tunjanganJabatan, float tunjanganKehadiran) {
	        this.kehadiran = kehadiran;
	        this.tunjanganGolongan = tunjanganGolongan;
	        this.tunjanganJabatan = tunjanganJabatan;
	        this.tunjanganKehadiran = tunjanganKehadiran;
	    }

	    // Getter dan setter untuk Kehadiran
	    public int getKehadiran() {
	        return kehadiran;
	    }

	    public void setKehadiran(int kehadiran) {
	        this.kehadiran = kehadiran;
	    }

	    // Metode untuk menghitung tunjangan kehadiran
	    public float tunjanganKehadiran() {
	        return kehadiran * tunjanganKehadiran;
	    }

	    // Metode untuk menghitung tunjangan jabatan
	    public float tunjanganJabatan() {
	        return tunjanganJabatan;
	    }

	    // Metode untuk menghitung tunjangan golongan
	    public float tunjanganGolongan() {
	        return tunjanganGolongan;
	    }

	    // Metode untuk menghitung gaji total
	    public float gajiTotal() {
	        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
	    }
	}

	class Karyawan {
	    private String nik;
	    private String nama;
	    private String jabatan;
	    private int golongan;

	    // Konstruktor
	    public Karyawan(String nik, String nama, String jabatan, int golongan) {
	        this.nik = nik;
	        this.nama = nama;
	        this.jabatan = jabatan;
	        this.golongan = golongan;
	    }

	    // Getter dan setter untuk NIK
	    public String getNik() {
	        return nik;
	    }

	    public void setNik(String nik) {
	        this.nik = nik;
	    }

	    // Getter dan setter untuk Nama
	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    // Getter dan setter untuk Jabatan
	    public String getJabatan() {
	        return jabatan;
	    }

	    public void setJabatan(String jabatan) {
	        this.jabatan = jabatan;
	    }

	    // Getter dan setter untuk Golongan
	    public int getGolongan() {
	        return golongan;
	    }

	    public void setGolongan(int golongan) {
	        this.golongan = golongan;
	    }

	    // Metode untuk menampilkan informasi karyawan
	    public void displayInfo() {
	        System.out.println("NIK: " + getNik());
	        System.out.println("Nama: " + getNama());
	        System.out.println("Jabatan: " + getJabatan());
	        System.out.println("Golongan: " + getGolongan());
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Memasukkan data untuk Manager
	        System.out.println("Masukkan data Manager:");
	        System.out.print("Kehadiran: ");
	        int kehadiranManager = scanner.nextInt();
	        System.out.print("Tunjangan Golongan: ");
	        float tunjanganGolonganManager = scanner.nextFloat();
	        System.out.print("Tunjangan Jabatan: ");
	        float tunjanganJabatanManager = scanner.nextFloat();
	        System.out.print("Tunjangan Kehadiran: ");
	        float tunjanganKehadiranManager = scanner.nextFloat();

	        Manager manager = new Manager(kehadiranManager, tunjanganGolonganManager, tunjanganJabatanManager, tunjanganKehadiranManager);{

	        // Memasukkan data untuk Karyawan
	        System.out.println("\nMasukkan data Karyawan:");
	        System.out.print("NIK: ");
	        String nikKaryawan = scanner.next();
	        System.out.print("Nama: ");
	        String namaKaryawan = scanner.next();
	        System.out.print("Jabatan: ");
	        String jabatanKaryawan = scanner.next();
	        System.out.print("Golongan: ");
	        int golonganKaryawan = scanner.nextInt();

	        Karyawan karyawan = new Karyawan(nikKaryawan, namaKaryawan, jabatanKaryawan, golonganKaryawan);

	        // Menampilkan informasi Manager dan Karyawan
	        System.out.println("\nInformasi Manager:");
	        System.out.println("Kehadiran: " + manager.getKehadiran());
	        System.out.println("Tunjangan Golongan: " + manager.tunjanganGolongan());
	        System.out.println("Tunjangan Jabatan: " + manager.tunjanganJabatan());
	        System.out.println("Tunjangan Kehadiran: " + manager.tunjanganKehadiran());
	        System.out.println("Gaji Total: " + manager.gajiTotal());

	        System.out.println("\nInformasi Karyawan:");
	        karyawan.displayInfo();

	        scanner.close();
	    }
	}
	}}

