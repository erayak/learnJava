package javaapplication4;
import java.util.Scanner;

/*
 * @author eray
 */
public class JavaApplication4 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.println("Ad:");
        String ad = tara.nextLine();
        System.out.println("Soyad:");
        String soyad = tara.nextLine();
        System.out.println( "\n" + "Merhaba " + ad + " " + soyad );

    }

}
