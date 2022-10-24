public class H04_Bir_String_Multidimensional_Arrayde_Icinde_a_Olan_Elemanlari_Console_Yazdiriniz {
    public static void main(String[] args) {


        //Bir String multidimensional array'de icinde "a" olan elemanlari consol'e yazdiriniz.

        String arr [] [] = { {"Caddelerde","tepsi"},{"gemide","tere","Var"} };

        for (String [] w: arr) {

            for (String k: w) {

               if (k.contains("a")) {//contains metodu:Bir string içerisinde arama işlemi yapmamızı sağlar.

                   System.out.print(k + " ");//Caddelerde Var
               }
            }
        }

        System.out.println();

        //Bir String multidimensional array'de icinde "a" olan elemanlari consol'e yazdiriniz.


        String brr [] [] = {{"Kitaplar","Dos"},{"Kitaplar","Arkadastir"}};

        for (String [] w : brr) {

            for (String a: w) {

                if (a.contains("a")) {
                    System.out.print(a + " ");
                }
            }
        }


    }
}
