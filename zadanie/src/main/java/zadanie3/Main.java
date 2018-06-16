package zadanie3;


import java.util.Scanner;

public class Main {
            private double getSquareSide(int field) {

                return Math.sqrt(field);
            }
            private double getTriangleSide(int field) {

                return Math.sqrt(4 * field / Math.sqrt(3));
            }
            private double getRadius(int field) {

                return Math.sqrt(field / Math.PI);
            }

            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                Main m = new Main();

                System.out.print("Podaj pole: ");
                int field = s.nextInt();

                System.out.println("Bok kwadratu wynosi: " + m.getSquareSide(field));
                System.out.println("Bok trójkąta wynosi: " + m.getTriangleSide(field));
                System.out.println("Promień koła wynosi: " + m.getRadius(field));
            }
            enum Choise {

            }
        }
































