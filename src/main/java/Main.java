import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, merkezAci;
        double pi = 3.14, daireDilimiAlani;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap Bilgisi Giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez Açı Bilgisini Giriniz : ");
        merkezAci = input.nextInt();

        daireDilimiAlani = (pi*(r*r)*merkezAci)/360;
        System.out.println("Daire Dilimi Alanı : " + daireDilimiAlani);
    }
}
