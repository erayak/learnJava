package javaapplication4;

/*
 * @author eray
 */
public class JavaApplication4 {

    public static void main(String[] args) {

        // İnt => String
        System.out.println("A Sample:");
        int x = 840, y = 155;
        String s1 = Integer.toString(y);
        String s2 = String.valueOf(x);
        System.out.println( s1 + " = " + s2 );

        // String => İnt
        System.out.println("Sample Two:");
        String z = "15", f = "15";
        int s3 = Integer.parseInt(z);
        int s4 = Integer.parseInt(f);
        System.out.println( "Total: " + (s3 + s4) );

    }

}
