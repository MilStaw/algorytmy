package zadanie5;

import java.util.Map;
import java.util.Scanner;


/*
--pobierz od uzytkownika slowo;
--sprawdz czy piersza litera jest taka sama jak ostatnia;
--sprawdz czy slowo czytane od tyłu będzie takie samo jak od przodu;
--jesli podane slowo jest palindromem to wypisz true a jesli nie jest to wypisz false;
*/
public class Palindrom {
    public static boolean isPalindrom(String napis){     ///odtad
        for (int i = 0; i < napis.length(); i++) {
            char first = napis.charAt(i);
            char last = napis.charAt(napis.length() - 1 - i);

            if (first != last) {
                return false;
            }
        }

        return true;                            //// dotad jest funkcja
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo1: ");
        String a = scanner.nextLine();

        System.out.println(isPalindrom(a));


        ////na gorze jest prostrzy sposob
//        for (int i = 0; i < a.length(); i++) {
//            char first = a.charAt(i);
//            char last = a.charAt(a.length() - 1 - i);
//
//            if (first == last) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//                break;
//            }
//        }  ///// to sam szkielet -> nalezy obrac to w funkcje


//




    }
}