package projrk3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Masukkan panjang sisi persegi: ");
			double sisi = input.nextDouble();

			double luas = sisi * sisi;
			double keliling = 4 * sisi;

			System.out.println("Luas persegi: " + luas);
			System.out.println("Keliling persegi: " + keliling);
		}
    }
}



