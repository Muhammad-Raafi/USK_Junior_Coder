import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harga Barang : Rp. ");
        double harga = input.nextDouble();

        System.out.print("Diskon       : ");
        double diskon = input.nextDouble();

        double diskonRp = harga * diskon / 100;
        double total = harga - diskonRp;

        System.out.println("Diskon(Rp.)  : Rp. " + (int) diskonRp);
        System.out.println("Total Harga  : Rp. " + (int) total);

        input.close();
    }
}