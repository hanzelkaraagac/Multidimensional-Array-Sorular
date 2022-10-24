import java.util.Arrays;

public class H06_Bir_Multidimensional_Arrayi_Normal_Arraye_Ceviren_Kodu_Yaziniz {
    public static void main(String[] args) {


        //Bir multidimensional array'i normal array'e ceviren kodu yaziniz.
        // { {2,5,1}, {32,75} } ===> {2, 5, 1, 32, 75}

        int arr [] [] = { {2,5,1}, {32,75} };

        int toplam =0;

        for (int [] w : arr) {

            toplam = toplam + w.length;
        } System.out.print(toplam);//

        System.out.println();


        int idx =0;

        int brr [] = new int [toplam];

        for (int [] w :arr) {

            for (int k : w) {

                brr [idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}
