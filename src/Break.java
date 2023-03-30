public class Break {
    public static void main(String[] args) {
        
        long counter = 1L;

        while (true) {
            System.out.println("Perulangan ke " + counter);
            counter++;
            if (counter == 20){
                break;
            }
        }
    }
    
}
