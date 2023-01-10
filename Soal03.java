import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {
	    // write your code here
        Scanner lh = new Scanner(System.in);
        int sisi = lh.nextInt();
        int [][] matriks = new int [sisi][sisi];
        for (int i = 0; i < sisi; i++){
            for (int j = 0; j < sisi; j++){
                matriks[i][j] = lh.nextInt();
            }
        }
        
        for (int i = 0; i < sisi ; i++){
            for (int j = 0; j < sisi; j++){
                for (int k = 0; k < sisi ; k++){
                    for (int l = 0; l < sisi; l++){

                        if (matriks[i][j] < matriks[k][l]){
                            int a = matriks [i][j];
                            matriks[i][j] = matriks [k][l];
                            matriks[k][l] = a;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < sisi; i++){
            for (int j = 0; j < sisi; j++){
                System.out.print(matriks [i][j] + " ");
            }
            System.out.println();
        }
    }
}
