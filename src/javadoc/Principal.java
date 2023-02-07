/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadoc;

import javadoc.SocUtil.SocUtil;
import javadoc.SocUtil.SocUtil;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("12345 és capicua: " + SocUtil.esCapikua(12345));
            System.out.println("1221 és capicua: " + SocUtil.esCapicua(1221));
            System.out.println("1234321 és capicua: " + SocUtil.esCapikua(1234321));
        } catch (EsNegatiuEX ex) {
        }

    }

}
