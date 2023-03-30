import java.util.Scanner;
public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print( "Masukan nama = ");
        String nama = input.nextLine();

        System.out.println("hai " + nama);

   }
}