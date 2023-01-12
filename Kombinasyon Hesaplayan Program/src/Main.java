import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, a, comb, nf = 1, rf = 1, nrf = 1;
        System.out.print("Combinasyonunu hesaplamak istediğiniz sayıları giriniz: ");
        n = input.nextInt();
        r = input.nextInt();
        for (a = 1; a <= n; a++) {
            nf *= a;
        }
        for (a = 1; a <= r; a++) {
            rf *= a;
        }
        for (a = 1; a <= (n - r); a++) {
            nrf *= a;
        }
        comb = nf / (rf * nrf);
        System.out.println("C(" + n + " " + r + ")" + " = " + comb);
    }
}