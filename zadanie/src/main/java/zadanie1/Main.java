package zadanie1;

public class Main {
    public int NWD(int a, int b) {
        int c = 0;
        for (; b != 0; ) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.NWD(15, 5));


    }
}


