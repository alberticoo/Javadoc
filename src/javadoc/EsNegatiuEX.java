/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package javadoc;

/**
 *
 * @author Alumno
 * @version 1.1, 01/26/23
 */
public class EsNegatiuEX extends Exception {

    /**
     * Creates a new instance of <code>EsNegatiuEX</code> without detail
     * message.
     */
    public EsNegatiuEX() {
        super("el valor no pot ser negatiu");
    }

    /**
     * Constructs an instance of <code>EsNegatiuEX</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EsNegatiuEX(String msg) {
        super(msg);
    }
}
