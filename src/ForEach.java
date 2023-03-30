public class ForEach {
    public static void main(String[] args) {
        //memudahkan untuk mengakses semua data pada array

        // Tanpa For Each
        int [] nilai = {1, 2, 3, 4 ,5 };
        for (int a = 0; a < nilai.length; a++ ) {
            System.out.println(nilai[a]);
        }

        //Mengunakan for each
        System.out.println("\nmemakai for each \n");

        for (int value : nilai){
            System.out.println(value);
        }

    }
}
