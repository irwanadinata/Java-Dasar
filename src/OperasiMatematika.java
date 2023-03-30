public class OperasiMatematika {
    public static void main(String[] args) {

        //OPERATOR ARITMATIKA
        // + penjumlahan
        // - pengurangan
        // * perkalian
        // / pembagian
        // % modulus/sisa bagi


        //OPERATOR AUGMENTED ASSIGNMENTS
        //result = result + 10	sama saja dengan result += 10
        //result = result - 10	sama saja dengan result -= 10
        //result = result * 10	sama saja dengan result *= 10
        //result = result / 10	sama saja dengan result /= 10
        //result = result % 10	sama saja dengan result %= 10

        //OPERATOR UNARY
        // +	Menandakan nilai positif
        // -	Menandakan nilai negatif
        // ++	Increment, menaikkan 1 angka (a++ ==  a=a+1) (a=+4 == a=a+4)
        // --	Decrement, menurunkan 1 angka (a-- == a=a-1) (a=-4 == a=a-4)

        //OPERATOR BITSIWE
        // & (AND)
        // | (OR)
        // ^ (XOR)
        // ~ (NOT)
        // << (Left shift)
        // >> (Shift ke kanan)

        //OPERATOR PERBANDINGAN
        // && (dan/and)
        // || (atau/or)
        // !  (not/tidak)

        int a = 120;
        int b  = 20;

        int hasilPenjumlahan = a + b;
        int hasilPengurangan = a - b;
        int hasilPerkalian = a * b;
        int hasilPembagian = a / b;
        int modulus = a % b;

        System.out.println("Hasil Penjumlahnya Adalah " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangannya Adalah " + hasilPengurangan);
        System.out.println("Hasil Perkaliannya Adalah " + hasilPerkalian);
        System.out.println("Hasil Pembagiannya Adalah " + hasilPembagian);
        System.out.println("Sisa Pembagiannya Adalah " + modulus);

    }
}
