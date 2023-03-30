import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {

        //Contoh1 (mengambil inputan dari user kemudian kita masukan ke statement

        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka : ");
        Float angka = input.nextFloat();

        if (angka == 0) {
            System.out.println(angka + " " + "ini bilangan nol");
        }

        else if (angka > 0) {
            System.out.println(angka + " " + "ini bilangan positif");
        }

        else {
            System.out.println(angka + " " + "ini bilangan negatif");
        }

        //Contoh2
        int nilai = 75;
        String ucapan;

        if (nilai == 75) {
            ucapan = "mantap jiwa";
        } else if (nilai == 80) {
            ucapan = "lebih mantap jiwa";
        } else
            ucapan = "mantap";

    }
}