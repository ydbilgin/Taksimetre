import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km, perKm = 2.20, Tutar, AcilisFiyat = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi KM cinsinden giriniz : ");
        km = input.nextDouble();

        Tutar = AcilisFiyat + (km * perKm);
        if (Tutar < 20) {
            Tutar = 20;
        } else{
            Tutar = AcilisFiyat + (km * perKm);
        }
        System.out.println("Tutar = " + Tutar);
    }
}