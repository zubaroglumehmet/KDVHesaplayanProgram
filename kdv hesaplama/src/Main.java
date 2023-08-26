import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0,  kdvTutari, KdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz:");
        tutar = input.nextDouble();


        if (tutar > 1000) {
            kdvOran1=0.2;
            kdvTutari = tutar * kdvOran1;
            KdvliTutar = tutar + kdvTutari;
        } else {
            kdvOran1=0.18;
            kdvTutari = tutar * kdvOran1;
            KdvliTutar = tutar + kdvTutari;
        }

        System.out.println("Kdvsiz Tutar:" + tutar);
        System.out.println("Kdv Orani:" + kdvOran1);
        System.out.println("KdvTutari:" + kdvTutari);
        System.out.println("Kdvli Tutari:" + KdvliTutar);
    }
}
