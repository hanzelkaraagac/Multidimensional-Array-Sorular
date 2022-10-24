public class H05_Bir_Tane_Integer_Multidimensional_Array_Olusturunuz_Bu_Arraydeki_Tum_Sayilarin_Toplamini_Veren_Kodu_Yaziniz {
    public static void main(String[] args) {

         /*
             Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
             Array veya Collection var ama "index" kullanmak zorundasiniz.
              o zaman"for-each-loop" calismaz. "for-loop" ve ya "while-loop" veya "do-while-loop" kullanmalisiniz.
         */


        //Bir tane integer multidimensional array olusturunuz.
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr [] [] = { {4,7,9}, {16,45,90}, {50}   };

        int sum =0;
        for (int [] w :arr) {

            for (int a: w) {

                sum = sum + a;
            }
        }
        System.out.println(sum);//221


    }
}
