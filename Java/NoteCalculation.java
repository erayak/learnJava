package javaapplication4;
import java.util.Scanner;

/*
 * @author eray
 */
public class JavaApplication4 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci Vize Notu:");
        int v1 = tara.nextInt();

        System.out.println("İkinci Vize Notu:");
        int v2 = tara.nextInt();

        System.out.println("Final Notu:");
        int fin = tara.nextInt();

        int hesap = (
                ( ( v1 * 30 ) / 100 ) + ( ( v2 * 30 ) / 100 ) + ( ( fin * 40 ) / 100 )
        );

        System.out.println( "Sonuç:" + hesap );

    }
}
