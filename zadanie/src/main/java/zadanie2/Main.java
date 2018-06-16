package zadanie2;

public class Main {
    private int multiply(int a, int b) {
        int suma = 0;
        for (int i = 0; i < b; i++) {
            suma += a;
        }
        return suma;
    }


    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.multiply(5, 2));
    }
}

///// potegowanie ////           int podstawa = 3;
 ///                             int wykladnik = 4;
///                              int wynik = podstawa;
///                            for (int i = 0; i < podstawa - 1; i++){
///                            power = m.multiply(podstawa, wynik);
///                     }   psvm(wynik);                          czyli bedzie to b do potegi a