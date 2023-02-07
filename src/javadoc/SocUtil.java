/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadoc;

/**
 *
 * @author Alumno
 * @version 1.1, 01/26/23
 */
public class SocUtil {

    /**
     * Comprueba si un número es capicua o no.
     *
     * @param numero
     * @return còpia <code>true</code> en caso de que el número introducido sea
     * capicua <br>
     * y <code>false> en caso de que el número introducido NO sea capicua.
     * @throws EsNegatiuEX
     * @see <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero">Sangaku Maths</a>
     * @deprecated As of JDK 1.35, replaced by {@link #esCapikua(int)}
     */
    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int numAlReves = 0;
        int còpia = numero;
        while (numero > 0) {
            numAlReves = numAlReves * 10 + numero % 10;
            numero /= 10;
        }
        return còpia == numAlReves;
    }

    /**
     * Comprueba si un número es capicua o no.
     *
     * @param numero
     * @return cadNum <code>true</code> en caso de que el número introducido sea
     * capicua <br>
     * y <code>false> en caso de que el número introducido NO sea capicua.
     * @throws EsNegatiuEX
     * @see <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero">Sangaku Maths</a>
     */
    public static boolean esCapikua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        String cadNum = numero + "";
        String numAlReves = (new StringBuilder(cadNum)).reverse().toString();
        return cadNum.equals(numAlReves);
    }

    /**
     * Comprueba si un número es primo o compuesto.
     *
     * @param numero
     * @return <code>true</code> si el número introducido es primo <br>
     * <code>false</code> si el número introducido es compuesto.
     * @throws EsNegatiuEX
     * @see <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero">Sangaku Maths</a>
     */
    public static boolean esPrimer(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int limit = numero / 2 + 1;
        int div = 2;
        while (div < limit) {
            if (numero % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }

    /**
     * Calcula el factorial del número introducido.
     * @param numero
     * @return fact. Devuelve el factorial del número introducido en caso de que este tenga.
     * @throws EsNegatiuEX
     * @see <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero">Sangaku Maths</a>
     */
    public static long getFactorial(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("no es pot calcular el factorial d'un número negatiu");
        }
        long fact = 1L;
        while (numero > 1) {
            fact *= numero;
            numero--;
        }
        return fact;
    }
}
