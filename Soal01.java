import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {
	    // write your code here
        Scanner lh = new Scanner(System.in);
        int jmlhPermainan = lh.nextInt();
        int temp = 0;
        int[] jmlhTekan = new int[jmlhPermainan];

        for (int i = 0; i < jmlhPermainan; i++){
            jmlhTekan[i] = lh.nextInt();
        }

        for (int i = 0; i < jmlhPermainan; i++){
            if (jmlhTekan[i] < 4){
                temp = jmlhTekan[i];
            }else {
                temp = jmlhTekan[i] % 4;
            }

            String hasil = "";
            if (temp == 0){
                hasil = "MATI MATI";
            }else if (temp == 1){
                hasil = "HIDUP MATI";
            }else if (temp == 2){
                hasil = "HIDUP HIDUP";
            }else if (temp == 3){
                hasil = "MATI HIDUP";
            }
            System.out.println(hasil);
        }
    }
}
