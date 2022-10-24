import java.util.Arrays;

public class H02_String_Bir_Multidimensional_Olusturunuz_Elemanlari_Ekleyiniz_Toplam_Eleman_Sayisini_Ekrana_Yazdiran_Kodu_Yaziniz {
    public static void main(String[] args) {

        //Example 1: String bir Multidimensional olusturunuz.
        //           Elemanlari ekleyiniz.
        //           toplam eleman sayisini ekrana yazdiran kodu yaziniz.

        String arr [] [] = new String[3][3];

        arr [0] [0] = "A";
        arr [0] [1] = "V";
        arr [0] [2] = "D";

        arr [1] [0] = "e";
        arr [1] [1] = "l";
        arr [1] [2] = "N";

        arr [2] [0] = "H";
        arr [2] [1] = "T";
        arr [2] [2] = "K";

        System.out.println(Arrays.deepToString(arr));//[[A, V, D], [e, l, N], [H, T, K]]

        int sum =0;

        for (String[] w:arr) {

            sum = sum + w.length;
        }
        System.out.println(sum);
    }
}
