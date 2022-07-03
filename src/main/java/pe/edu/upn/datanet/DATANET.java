/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upn.datanet;

import DATANET.GIU.INTERFAZ;
import DATANET.GIU.INTERFAZ_2;


/**
 *
 * @author Màximo
 */
public class DATANET {

    public static void main(String[] args) {
        Conexion objetoconexion = new Conexion();
        //objetoconexion.establecerconexion();
        INTERFAZ f = new INTERFAZ();
        f.setVisible (true);
        
    }
}
