public class OperasiBoolean {
    public static void main(String[] args) {
        // && (dan/and)
        // || (atau/or)
        // !  (not/tidak)

        //OPERATOR AND
        // True jika semuanya true, jika salah satu saja false maka hasilnya akan false

        //OPERATOR OR
        //True jika ada salah satu yang true, jika semuanya false maka hasilnya akan false

        //OPERATOR NOT
        //Kebalikannya

        var nilai = 70;
        var absen = 10;

        var lulus = nilai >= 70 && absen > 10 ;
        System.out.println("Apakah Anda Lulus?\n" + lulus );

        var nilai1 = 50;
        var nilai2 = 20;

        var nilaiTinggi = nilai1 >=50 || nilai2>30;
        System.out.println(nilaiTinggi);

    }
}
