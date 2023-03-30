public class Array {
    public static void main(String[] args) {

        //int[] Arrayint = new int[]{10, 20, 30, 40, 50};
        int[] Arrayint = {10, 20, 30, 40, 50};

        //mengambil data array
        var coba = Arrayint[2];
        System.out.println(coba);

        //mengubah data array

        var coba2 = Arrayint[0] = 12 ;
        System.out.println(coba2);

        //mengambil panjang array
        int coba3 = Arrayint.length;
        System.out.println(coba3);



    }
}
