package zadanie6;

public class Figury {

    private static void a(int i, int i1) {      /// pusty prostokat
        int szer = 15;
        int wys = 5;

        for (i = 0; i < wys; i++) {
            for (int j = 0; j < szer; j++)
                if ((i == 0) || (i == wys - 1))
                    System.out.print('*');
                else if ((j == 0) || (j == szer - 1)) System.out.print('*');
                else System.out.print(' ');
            System.out.println();

        }
    }

    private static void b(int i, int i1) {     //// pelny prostokat
        int szer = 15;
        int wys = 5;
        for (i = 0; i < wys; i++) {
            for (int j = 0; j < szer; j++)
                System.out.print('*');
            System.out.println();

        }

    }

    private static void c(int i) {           /// pusty trojkat rownoramienny
        int wys = 10;
        for (i = 1; i <= wys; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1 || i == 1 || i == wys) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }

            System.out.println();


        }
    }

    private void trojkat(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }

    private void kolo1(int posY, int posX, int radius) {
        for (int i = 0;i <= posX + radius; i++) {
            for (int j = 0;j <=posY + radius; j++) {
                int xSquared = (i - posX)*(i - posX);
                int ySquared = (j - posY)*(j - posY);
                if (Math.abs(xSquared + ySquared - radius) <= radius) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private void kolo2(int posY, int posX, int radius) {
        for (int i = 0; i <= posX + radius; i++) {
            for (int j = 0; j <= posY + radius; j++) {
                int xSquared = (i - posX) * (i - posX);
                int ySquared = (j - posY) * (j - posY);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {



       Figury m = new Figury();
        m.a (5, 15);
        System.out.println();
        m.b(5, 10);
        System.out.println();
        m.c(5);
        System.out.println();
        m.trojkat(5);
        System.out.println();
        m.kolo1(5, 5, 5);
        System.out.println();
        m.kolo2(3, 3, 3);
    }
}











