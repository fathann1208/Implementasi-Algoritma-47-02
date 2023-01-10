import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {
	    // write your code here
        Scanner lh = new Scanner(System.in);
        int jmlhPeserta = lh.nextInt();
        int angka = lh.nextInt();
        int[] num = new int[jmlhPeserta];

        for (int i = 0; i < jmlhPeserta; i++){
            num[i] = lh.nextInt();
        }

        String hasil = "";
        for (int i = 0; i < num.length; i++){
            for (int j = i + 1; j < num.length; j++){
                if (hasil.contains(Integer.toString(i+1)) || hasil.contains(Integer.toString(j+1))){
                    continue;
                }

                if ((num[i] + num[j]) == angka && i != j){
                    hasil += i + 1 + " ";
                    hasil += j + 1 + "\n";
                }
            }
        }
        System.out.println(hasil);
        lh.close();
    }
}
