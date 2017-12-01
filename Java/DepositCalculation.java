package javaapplication4;
import java.util.Scanner;
/*
 * @author eray
 */
public class JavaApplication4 {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Mevduat Tutarı:");
        double para = tara.nextDouble();

        System.out.println("Oran:");
        double oran = tara.nextDouble();

        System.out.println("Mevduat Süresi Kaç Ay");
        double birimSure = tara.nextDouble();

        double hesap =  ( ( ( para / 100 ) * ( oran / 12 ) ) * birimSure );

        System.out.println( "Alınacak Para: " + (int)hesap );

    }
}
