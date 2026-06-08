package PBO07_24060124140139.Coersion;

public class Coersion {
    public static void main(String[] args) {
        System.out.println("\nBagian A");
        int x = 65;
        System.out.println("x berupa int  : " + x);
        System.out.println("x berupa char : " + (char) x);
        System.out.println("x berupa real : " + (double) x);
        
        System.out.println("\nBagian B");
        int a = 20;
        double b = a;
        int c = (int) b;
        System.out.println("nilai a (int): " + a + ", nilai b (real) : " + b + ", nilai c (int) : " + c);

        System.out.println("\nBagian C");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        System.out.println("S (konkatenasi X dan Y): " + S);
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Z (penjumlahan X dan Y): " + Z);

        System.out.println("\nBagian D");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        System.out.println("R (konkatenasi P dan Q): " + R);
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("D (penjumlahan P dan Q): " + D);

        System.out.println("\nBagian E");
        Integer A = Integer.parseInt(S);
        System.out.println("A : " + A);

        System.out.println("\nBagian F");
        String T = Integer.toString(A);
        System.out.println("T : " + T);
    }
    
}