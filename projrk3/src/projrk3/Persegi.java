package projrk3;
import java.util.Scanner;

public class Persegi {
    public static void main1(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Masukkan panjang sisi persegi: ");
			double sisi = input.nextDouble();

			double luas = sisi * sisi;
			double keliling = 4 * sisi;

			System.out.println("Luas persegi: " + luas);
			System.out.println("Keliling persegi: " + keliling);
		}
    }

    public void execute1()
    {
        System.out.println("Hi.. Executing From claas Persegi");
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Masukkan panjang persegi panjang: ");
			double panjang = input.nextDouble();
			System.out.print("Masukkan lebar persegi panjang: ");
			double lebar = input.nextDouble();

			double luas = panjang * lebar;
			double keliling = 2 * (panjang + lebar);
			
			System.out.println("Panjang persegi panjang: " + panjang);
			System.out.println("Lebar persegi panjang: " + lebar);
			System.out.println("Luas persegi panjang: " + luas);
			System.out.println("Keliling persegi panjang: " + keliling);
		}
    }

        

    public void execute()
    {
        System.out.println("Hi.. Executing From Class persegiPanjang");
    }
}
public class Tester{
    
        // Implements metode main() akan ditulis di sini
        System.out.println("Metode main() dari Persegi,PersegiPnajang");
    }

    public static void main(String[] args) {
        // Contoh penggunaan metode main()
         Tester = new Tersetr();
         Tester.main();
    }

{
    
}
public class Main
{
	public static <C> void main(String[] args) 
	{
        C obj = Tester(); // creating object of class C
        ((Persegi) obj).execute1(); // execute() method is present in both class A and B
	}

	private static <C> C Tester() {
		// TODO Auto-generated method stub
		return null;
	}
}
}
