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
     * Comprueba si un n�mero es capicua o no.
     *
     * @param numero
     * @return c�pia <code>true</code> en caso de que el n�mero introducido sea
     * capicua <br>
     * y <code>false> en caso de que el n�mero introducido NO sea capicua.
     * @throws EsNegatiuEX
     * @see <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero">Sangaku Maths</a>
     * @deprecated As of JDK 1.35, replaced by {@link #esCapikua(int)}
     */
    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int numAlReves = 0;
        int c�pia = numero;
        while (numero > 0) {
            numAlReves = numAlReves * 10 + numero % 10;
            numero /= 10;
        }
        return c�pia == numAlReves;
    }

    /**
     * Comprueba si un n�mero es capicua o no.
     *
     * @param numero
     * @return cadNum <code>true</code> en caso de que el n�mero introducido sea
     * capicua <br>
     * y <code>false> en caso de que el n�mero introducido NO sea capicua.
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
     * Comprueba si un n�mero es primo o compuesto.
     *
     * @param numero
     * @return <code>true</code> si el n�mero introducido es primo <br>
     * <code>false</code> si el n�mero introducido es compuesto.
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
     * Calcula el factorial del n�mero introducido.
     * @param numero
     * @return fact. Devuelve el factorial del n�mero introducido en caso de que este tenga.
     * @throws EsNegatiuEX
     * @see <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero">Sangaku Maths</a>
     */
    public static long getFactorial(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("no es pot calcular el factorial d'un n�mero negatiu");
        }
        long fact = 1L;
        while (numero > 1) {
            fact *= numero;
            numero--;
        }
        return fact;
    }
}
