import java.util.*;

public class Soal02 {

    public static void main(String[] args) {
	    // write your code here
        Scanner lh = new Scanner(System.in);
        String tulisan = lh.nextLine();

        String[] teks = tulisan.split(" ");
        ArrayList<String> hasilTeks = new ArrayList<>();

        for(int i = 0; i < teks.length; i++){
            List<String> listTeks = Arrays.asList(teks[i].split(""));
            ArrayList<String> alphabet = new ArrayList<String>(listTeks);
            for (int j = 0; j < 2; j++){
                alphabet.remove(alphabet.size() - 1);
            }
            hasilTeks.add(String.join("", alphabet));
        }
        System.out.println(String.join(" ", hasilTeks));
    }
}
