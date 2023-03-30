public class SwitchStatement {
    public static void main(String[] args) {

        //hanya untuk perbandingan ==

        String nilai = "C";
        switch (nilai){
            case "A":
                System.out.println("nilai Anda sangat baik");
                break;
            case "B":
            case "C":
                System.out.println("nilai Anda baik" );
                break;
            case"D":
                System.out.println("tetap semangat untuk belajar lagi");
                break;
            default: //jika tidak ada yang sesuai dengan statement di atas makan akan masuk kesini
                System.out.println("Belajar, belajar, belajar");
        }

    }
}
