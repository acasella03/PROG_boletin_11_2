package prog_boletin_11_2;

import java.math.BigInteger;

public class PROG_boletin_11_2 {

    public static void main(String[] args) {
        int suma = 0;
        //long producto = 1;
        BigInteger producto = new BigInteger("1");

        for (int i = 10; i <= 90; i++) {
            suma = suma + i;
            producto = producto.multiply(BigInteger.valueOf(i));
        }
        System.out.println("La suma de los número comprendidos del 10 al 90 es = " + suma);
        System.out.println("El producto de los número comprendidos del 10 al 90 es = " + producto);
    }

}
