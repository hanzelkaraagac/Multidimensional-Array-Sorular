import java.util.Arrays;

public class H01_MultidimensionalArrayNasilOlusturulur {
    public static void main(String[] args) {

   //Not: Bir Array'in elemanlari Array ise BU Array'ler Multidimensional Array'dir.


        //Multidimensional Array nasil olusturulur?
        int arr [] [] = new int[3][2];

        //Multidimensional Array nasil ekrana yazdirilir?
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]

        //Multidimensional  Array'lere eleman ekleme nasil yapilir?

        arr [0] [0] = 7;
        arr [0] [1] = 6;
        arr [1] [0] = 18;
        arr [1] [1] = 9;
        arr [2] [0] = 5;
        arr [2] [1] = 75;


        //Multidimensional Array consol'e nasil yazdirilir?
        System.out.println(Arrays.deepToString(arr));//[[7, 6], [18, 9], [5, 75]]

        //Multidimensional Array'lerde Array elemanlardan biri nasil yazdirilir?
        System.out.println(Arrays.toString(arr [1]));//[18, 9]


        //Multidimensional Array'lerde ic Array'lerdeki elemanlar nasil yazdirilir?
        System.out.println(arr[1][0]);//18









    }
}
